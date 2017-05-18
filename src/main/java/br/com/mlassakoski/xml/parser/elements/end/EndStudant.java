package br.com.mlassakoski.xml.parser.elements.end;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.STUDANT;

import javax.xml.namespace.QName;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;

@Component
public class EndStudant implements EndElementParseInterface {

    @Override
    public void parse(final EndElement endElement, final StudantsEnum tag) {

        if (tag.equals(STUDANT)) {
            System.out.println(tag);
        }
    }
}
