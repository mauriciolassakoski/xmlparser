package br.com.mlassakoski.xml.parser.elements.start;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.LASTNAME;
import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.STUDANT;

import javax.xml.namespace.QName;
import javax.xml.stream.events.StartElement;

import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;

@Component
public class StartLastName implements StartElementParseInterface {

    @Override
    public void parse(final StartElement startElement, final StudantsEnum tag) {

        if (tag.equals(LASTNAME)) {
            System.out.println(tag);
        }
    }
}
