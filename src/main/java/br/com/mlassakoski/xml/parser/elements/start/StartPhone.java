package br.com.mlassakoski.xml.parser.elements.start;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.PHONE;

import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.entities.models.ParserDTO;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;

import java.util.Deque;

@Component
public class StartPhone implements StartElementParseInterface {

    @Override
    public void parse(final StartElement startElement, final StudantsEnum tag,
                      Deque<StudantsEnum> stack, ParserDTO parserDTO) {

        stack.push(PHONE);
    }
}
