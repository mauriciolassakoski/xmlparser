package br.com.mlassakoski.xml.parser;

import java.util.Deque;

import javax.xml.stream.events.StartElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;
import br.com.mlassakoski.xml.entities.models.Studant;
import br.com.mlassakoski.xml.parser.mapper.ElementMapper;
import br.com.mlassakoski.xml.parser.factory.StartElementFactory;

@Component
public class StartElementParser {

    @Autowired
    private ElementMapper mapper;
    @Autowired
    private StartElementFactory factory;

    public void parse(final StartElement startElement, final Studant studant, Deque<StudantsEnum> stack) {
        final StudantsEnum tag = mapper.getTag(startElement.getName().getLocalPart());
        final StartElementParseInterface clazz = factory.getParser(tag);

        if (clazz != null)
            clazz.parse(startElement, tag, studant, stack);
    }
}
