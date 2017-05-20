package br.com.mlassakoski.xml.parser.elements.start;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.LASTNAME;

import java.util.Deque;

import javax.xml.stream.events.StartElement;

import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;
import br.com.mlassakoski.xml.entities.models.Studant;

@Component
public class StartLastName implements StartElementParseInterface {

    @Override
    public void parse(final StartElement startElement, final StudantsEnum tag, Studant studant,
            Deque<StudantsEnum> stack) {

        stack.push(LASTNAME);
    }
}
