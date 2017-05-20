package br.com.mlassakoski.xml.parser.elements.end;

import javax.xml.stream.events.EndElement;

import br.com.mlassakoski.xml.entities.models.Studant;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;

import java.util.Deque;

@Component
public class EndName implements EndElementParseInterface {

    @Override
    public void parse(final EndElement endElement, final StudantsEnum tag, Studant studant, Deque<StudantsEnum> stack, StringBuilder builder) {

        stack.pop();
    }
}
