package br.com.mlassakoski.xml.parser;

import javax.xml.stream.events.StartElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;
import br.com.mlassakoski.xml.parser.mapper.ElementMapper;

@Component
public class StartElementParser {

    @Autowired
    private ElementMapper mapper;
    @Autowired
    private StartElementParseInterface start;

    public void parse(final StartElement startElement) {
        final StudantsEnum tag = mapper.getMap(startElement.getName().getLocalPart());
        start.parse(startElement, tag);
    }
}
