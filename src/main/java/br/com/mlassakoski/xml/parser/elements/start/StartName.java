package br.com.mlassakoski.xml.parser.elements.start;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.NAME;

import java.util.Deque;

import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.entities.models.ParserDTO;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;

@Component
public class StartName implements StartElementParseInterface {

    @Override
    public void parse(final StartElement startElement, final StudantsEnum tag,
                      Deque<StudantsEnum> stack, ParserDTO parserDTO) {

        stack.push(NAME);
    }
}
