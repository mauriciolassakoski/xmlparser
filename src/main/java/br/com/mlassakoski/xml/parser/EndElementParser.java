package br.com.mlassakoski.xml.parser;

import javax.xml.stream.events.EndElement;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;
import br.com.mlassakoski.xml.entities.models.ParserDTO;
import br.com.mlassakoski.xml.entities.models.Studant;
import br.com.mlassakoski.xml.parser.mapper.ElementMapper;
import br.com.mlassakoski.xml.parser.factory.EndElementFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Deque;

@Component
public class EndElementParser {

    @Autowired
    private ElementMapper mapper;
    @Autowired
    private EndElementFactory factory;

    public void parse(final EndElement endElement, Deque<StudantsEnum> stack, ParserDTO parserDTO) {
        final StudantsEnum tag = mapper.getTag(endElement.getName().getLocalPart());
        final EndElementParseInterface clazz = factory.getParser(tag);

        if (clazz != null)
            clazz.parse(endElement, tag, stack, parserDTO);
    }
}
