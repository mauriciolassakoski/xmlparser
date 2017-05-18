package br.com.mlassakoski.xml.parser.elements.end;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.LASTNAME;
import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.STUDANT;

import javax.xml.stream.events.EndElement;

import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;

@Component
public class EndLastName implements EndElementParseInterface {

    @Override
    public void parse(final EndElement endElement, final StudantsEnum tag) {

        if (tag.equals(LASTNAME)) {
            System.out.println(tag);
        }
    }
}
