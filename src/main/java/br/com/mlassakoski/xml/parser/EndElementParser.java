package br.com.mlassakoski.xml.parser;

import javax.xml.namespace.QName;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;

import org.springframework.stereotype.Component;

@Component
public class EndElementParser {

    public void parse(EndElement startElement) {
        final String name = startElement.getName().getLocalPart();
        if (name.equalsIgnoreCase("studant")){
            System.out.println("close studant");
        }
    }
}
