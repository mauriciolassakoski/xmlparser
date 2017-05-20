package br.com.mlassakoski.xml.parser.mapper;

import static br.com.mlassakoski.xml.entities.enums.StudantsEnum.*;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;

@Component
public class ElementMapper {

    public StudantsEnum getTag(final String key) {
        HashMap<String, StudantsEnum> map = new HashMap<>();
        map.put("studants", STUDANTS);
        map.put("studant", STUDANT);
        map.put("name", NAME);
        map.put("lastname", LASTNAME);
        map.put("phone", PHONE);

        return map.get(key);
    }
}
