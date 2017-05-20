package br.com.mlassakoski.xml.parser.elements.start;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.PHONE;

import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.entities.models.Studant;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;

import java.util.Deque;
import java.util.Queue;

@Component
public class StartPhone implements StartElementParseInterface {

    @Override
    public void parse(final StartElement startElement, final StudantsEnum tag, Studant studant,
            Deque<StudantsEnum> stack) {

        stack.push(PHONE);
    }
}
