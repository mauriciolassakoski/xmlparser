package br.com.mlassakoski.xml.parser;

import java.util.Deque;

import javax.xml.stream.events.StartElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;
import br.com.mlassakoski.xml.entities.models.Studant;
import br.com.mlassakoski.xml.parser.mapper.ElementMapper;
import br.com.mlassakoski.xml.parser.mapper.StartElementMapper;

@Component
public class StartElementParser {

    @Autowired
    private ElementMapper tagMapper;
    @Autowired
    private StartElementMapper mapper;

    public void parse(final StartElement startElement, final Studant studant, Deque<StudantsEnum> stack) {
        final StudantsEnum tag = tagMapper.getTag(startElement.getName().getLocalPart());
        final StartElementParseInterface clazz = mapper.getParser(tag);

        if (clazz != null)
            clazz.parse(startElement, tag, studant, stack);
    }
}
