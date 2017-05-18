package br.com.mlassakoski.xml.parser.elements.end;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.NAME;
import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.STUDANT;

import javax.xml.stream.events.EndElement;

import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;

@Component
public class EndName implements EndElementParseInterface {

    @Override
    public void parse(final EndElement endElement, final StudantsEnum tag) {

        if (tag.equals(NAME)) {
            System.out.println(tag);
        }
    }
}
