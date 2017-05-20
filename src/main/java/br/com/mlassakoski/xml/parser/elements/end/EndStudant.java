package br.com.mlassakoski.xml.parser.elements.end;

import javax.xml.stream.events.EndElement;

import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;
import br.com.mlassakoski.xml.entities.models.ParserDTO;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;

import java.util.Deque;

@Component
public class EndStudant implements EndElementParseInterface {

    @Override
    public void parse(final EndElement endElement, final StudantsEnum tag, Deque<StudantsEnum> stack, ParserDTO parserDTO) {

        System.out.println(parserDTO.getStudant());
        stack.pop();
    }
}
