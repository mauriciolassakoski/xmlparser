package br.com.mlassakoski.xml.parser;

import javax.xml.stream.events.EndElement;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;
import br.com.mlassakoski.xml.parser.mapper.ElementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EndElementParser {

    @Autowired
    private ElementMapper mapper;
    @Autowired
    private EndElementParseInterface end;

    public void parse(final EndElement endElement) {
        final StudantsEnum tag = mapper.getMap(endElement.getName().getLocalPart());

        end.parse(endElement, tag);
    }
}
