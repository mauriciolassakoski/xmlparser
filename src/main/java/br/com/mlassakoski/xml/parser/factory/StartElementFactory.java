package br.com.mlassakoski.xml.parser.factory;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.*;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.interfaces.StartElementParseInterface;
import br.com.mlassakoski.xml.parser.elements.start.StartLastName;
import br.com.mlassakoski.xml.parser.elements.start.StartName;
import br.com.mlassakoski.xml.parser.elements.start.StartPhone;
import br.com.mlassakoski.xml.parser.elements.start.StartStudant;

@Component
public class StartElementFactory {

    @Autowired
    private StartStudant studant;
    @Autowired
    private StartName name;
    @Autowired
    private StartLastName lastName;
    @Autowired
    private StartPhone phone;

    public StartElementParseInterface getParser(final StudantsEnum key) {
        HashMap<StudantsEnum, StartElementParseInterface> map = new HashMap<>();
        map.put(STUDANT, studant);
        map.put(NAME, name);
        map.put(LASTNAME, lastName);
        map.put(PHONE, phone);

        return map.get(key);
    }
}
