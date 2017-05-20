package br.com.mlassakoski.xml.parser;

import javax.xml.stream.events.EndElement;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;
import br.com.mlassakoski.xml.entities.models.Studant;
import br.com.mlassakoski.xml.parser.mapper.ElementMapper;
import br.com.mlassakoski.xml.parser.mapper.EndElementMapper;
import br.com.mlassakoski.xml.parser.mapper.StartElementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Deque;

@Component
public class EndElementParser {

    @Autowired
    private ElementMapper tagMapper;
    @Autowired
    private EndElementMapper mapper;

    public void parse(final EndElement endElement, Studant studant, Deque<StudantsEnum> stack) {
        final StudantsEnum tag = tagMapper.getTag(endElement.getName().getLocalPart());
        final EndElementParseInterface clazz = mapper.getParser(tag);

        if (clazz != null)
            clazz.parse(endElement, tag, stack);
    }
}
