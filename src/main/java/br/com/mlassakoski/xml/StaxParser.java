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

        try {
            final String fileName = this.getClass().getClassLoader().getResource("files/studants.xml").getFile();
            final XMLEventReader eventReader = factory.createXMLEventReader(
                    new FileReader(fileName));

            while (eventReader.hasNext()) {
                final XMLEvent event = eventReader.nextEvent();
                final Studant studant = new Studant();

                switch (event.getEventType()) {
                    case XMLStreamConstants.START_ELEMENT:
                        final StartElement startElement = event.asStartElement();
                        startElementParser.parse(startElement, studant, stack);
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        final Characters characters = event.asCharacters();
                        System.out.println(characters);
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        final EndElement endElement = event.asEndElement();
                        endElementParser.parse(endElement, studant, stack);
                        break;
                }
                System.out.println(studant);
            }
        } catch (final FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
