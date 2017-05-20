package br.com.mlassakoski.xml.parser.elements.end;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.NAME;

import javax.xml.stream.events.EndElement;

import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;

import java.util.Deque;

@Component
public class EndName implements EndElementParseInterface {

    @Override
    public void parse(final EndElement endElement, final StudantsEnum tag, Deque<StudantsEnum> stack) {

        stack.pop();
    }
}
