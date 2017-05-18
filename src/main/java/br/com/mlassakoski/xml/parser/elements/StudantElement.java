package br.com.mlassakoski.xml.parser.elements;

import br.com.mlassakoski.xml.StudantsEnum;
import br.com.mlassakoski.xml.parser.StartElementParseInterface;
import org.springframework.stereotype.Component;

import static br.com.mlassakoski.xml.StudantsEnum.STUDANT;

@Component
public class StudantElement implements StartElementParseInterface {

    @Override
    public void parse(final StudantsEnum tag) {

        if (tag.equals(STUDANT)) {
            System.out.println(tag);
        }
    }
}
