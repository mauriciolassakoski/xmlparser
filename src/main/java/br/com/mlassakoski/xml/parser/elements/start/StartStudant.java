package br.com.mlassakoski.xml.parser.elements.start;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.STUDANT;

import java.util.Deque;

import javax.xml.namespace.QName;
import javax.xml.stream.events.StartElement;

import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;
import br.com.mlassakoski.xml.entities.models.Studant;

@Component
public class StartStudant implements StartElementParseInterface {

    @Override
    public void parse(final StartElement startElement, final StudantsEnum tag, final Studant studant,
            final Deque<StudantsEnum> queue) {

        final String code = startElement.getAttributeByName(QName.valueOf("code")).getValue();
        queue.push(STUDANT);
        studant.setCode(Integer.valueOf(code));
    }
}
