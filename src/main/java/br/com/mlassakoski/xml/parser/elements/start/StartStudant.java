package br.com.mlassakoski.xml.parser.elements.start;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import javax.xml.stream.events.StartElement;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.STUDANT;

@Component
public class StartStudant implements StartElementParseInterface {

    @Override
    public void parse(final StartElement startElement, final StudantsEnum tag) {

        if (tag.equals(STUDANT)) {
            final String id = startElement.getAttributeByName(QName.valueOf("code")).getValue();
            System.out.println(tag);
            System.out.println("open studant with code " + id);
        }
    }
}
