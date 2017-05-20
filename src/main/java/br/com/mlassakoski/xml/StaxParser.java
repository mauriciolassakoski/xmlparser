package br.com.mlassakoski.xml;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.Deque;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import br.com.mlassakoski.xml.entities.models.ParserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.models.Studant;
import br.com.mlassakoski.xml.parser.EndElementParser;
import br.com.mlassakoski.xml.parser.StartElementParser;

@Component
public class StaxParser {

    @Autowired
    private StartElementParser startElementParser;
    @Autowired
    private EndElementParser endElementParser;

    public void parseXml() {
        final XMLInputFactory factory = XMLInputFactory.newInstance();
        final Deque<StudantsEnum> stack = new ArrayDeque<>();
        final ParserDTO parserDTO = new ParserDTO();
        parserDTO.newBuilder();

        try {
            final String fileName = this.getClass().getClassLoader().getResource("files/studants.xml").getFile();
            final XMLEventReader eventReader = factory.createXMLEventReader(
                    new FileReader(fileName));

            while (eventReader.hasNext()) {
                final XMLEvent event = eventReader.nextEvent();

                switch (event.getEventType()) {
                    case XMLStreamConstants.START_ELEMENT:
                        final StartElement startElement = event.asStartElement();
                        startElementParser.parse(startElement, stack, parserDTO);
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        final Characters characters = event.asCharacters();
                        parserDTO.addToBuilder(characters.asCharacters());
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        final EndElement endElement = event.asEndElement();
                        endElementParser.parse(endElement, stack, parserDTO);
                        break;
                }
            }
        } catch (final FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
