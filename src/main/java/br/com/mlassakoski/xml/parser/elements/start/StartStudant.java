package br.com.mlassakoski.xml.parser.elements.start;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.STUDANT;

import java.util.Deque;

import javax.xml.namespace.QName;
import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.entities.models.ParserDTO;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;

@Component
public class StartStudant implements StartElementParseInterface {

    @Override
    public void parse(final StartElement startElement, final StudantsEnum tag,
                      final Deque<StudantsEnum> queue, ParserDTO parserDTO) {

        final String code = startElement.getAttributeByName(QName.valueOf("code")).getValue();
        queue.push(STUDANT);

        parserDTO.newStudant();
        parserDTO.getStudant().setCode(Integer.valueOf(code));
    }
}
