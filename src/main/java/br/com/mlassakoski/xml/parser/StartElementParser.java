package br.com.mlassakoski.xml.parser;

import javax.xml.namespace.QName;
import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.StudantsEnum;
import br.com.mlassakoski.xml.parser.mapper.StartElementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartElementParser {

    @Autowired
    private StartElementMapper mapper;
    @Autowired
    private StartElementParseInterface start;

    public void parse(StartElement startElement) {
        final StudantsEnum qname = mapper.getMap(startElement.getName().getLocalPart());

        start.parse(qname);
        if (qname.equals("studant")) {
            final String id = startElement.getAttributeByName(QName.valueOf("id")).getValue();
            System.out.println("open studant with id " + id);
        }
    }
}
