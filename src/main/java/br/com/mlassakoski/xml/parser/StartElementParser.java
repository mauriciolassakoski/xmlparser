package br.com.mlassakoski.xml.parser;

import java.util.Deque;

import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.entities.models.ParserDTO;
import br.com.mlassakoski.xml.entities.models.Studant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;
import br.com.mlassakoski.xml.parser.factory.StartElementFactory;
import br.com.mlassakoski.xml.parser.mapper.ElementMapper;

@Component
public class StartElementParser {

    @Autowired
    private ElementMapper mapper;
    @Autowired
    private StartElementFactory factory;

    public void parse(final StartElement startElement, Deque<StudantsEnum> stack, ParserDTO parserDTO) {
        final StudantsEnum tag = mapper.getTag(startElement.getName().getLocalPart());
        final StartElementParseInterface clazz = factory.getParser(tag);

        if (clazz != null)
            clazz.parse(startElement, tag, stack, parserDTO);
    }
}
