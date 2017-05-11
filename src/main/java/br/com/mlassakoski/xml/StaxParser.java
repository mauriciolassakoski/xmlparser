package br.com.mlassakoski.xml;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.springframework.stereotype.Component;

@Component
public class StaxParser {

    public void parseXml() {
        final XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            final XMLEventReader eventReader = factory.createXMLEventReader(
                    new FileReader("input.txt"));

            while (eventReader.hasNext()) {
                final XMLEvent event = eventReader.nextEvent();

                switch (event.getEventType()) {
                    case XMLStreamConstants.START_ELEMENT:
                        final StartElement startElement = event.asStartElement();
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        final Characters characters = event.asCharacters();
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        final EndElement endElement = event.asEndElement();
                        break;
                }
            }
        } catch (final FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
