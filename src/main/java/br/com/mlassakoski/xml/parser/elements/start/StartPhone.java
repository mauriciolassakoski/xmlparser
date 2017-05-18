package br.com.mlassakoski.xml.parser.elements.start;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.PHONE;
import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.STUDANT;

import javax.xml.namespace.QName;
import javax.xml.stream.events.StartElement;

import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;

@Component
public class StartPhone implements StartElementParseInterface {

    @Override
    public void parse(final StartElement startElement, final StudantsEnum tag) {

        if (tag.equals(PHONE)) {
            System.out.println(tag);
        }
    }
}
