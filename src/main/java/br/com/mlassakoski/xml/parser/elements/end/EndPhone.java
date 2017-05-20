package br.com.mlassakoski.xml.parser.elements.end;

import javax.xml.stream.events.EndElement;

import br.com.mlassakoski.xml.entities.models.ParserDTO;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;

import java.util.Deque;

@Component
public class EndPhone implements EndElementParseInterface {

    @Override
    public void parse(final EndElement endElement, final StudantsEnum tag, Deque<StudantsEnum> stack, ParserDTO parserDTO) {

        parserDTO.getStudant().setPhone(parserDTO.getBuilder().toString().trim());
        parserDTO.clearBuilder();
        stack.pop();
    }
}
