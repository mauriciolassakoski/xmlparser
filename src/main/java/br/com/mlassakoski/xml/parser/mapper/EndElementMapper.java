package br.com.mlassakoski.xml.parser.mapper;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.*;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.EndElementParseInterface;
import br.com.mlassakoski.xml.parser.elements.end.EndLastName;
import br.com.mlassakoski.xml.parser.elements.end.EndName;
import br.com.mlassakoski.xml.parser.elements.end.EndPhone;
import br.com.mlassakoski.xml.parser.elements.end.EndStudant;

@Component
public class EndElementMapper {

    @Autowired
    private EndStudant studant;
    @Autowired
    private EndName name;
    @Autowired
    private EndLastName lastName;
    @Autowired
    private EndPhone phone;

    public EndElementParseInterface getParser(final StudantsEnum key) {
        HashMap<StudantsEnum, EndElementParseInterface> map = new HashMap<>();
        map.put(STUDANT, studant);
        map.put(NAME, name);
        map.put(LASTNAME, lastName);
        map.put(PHONE, phone);

        return map.get(key);
    }
}
