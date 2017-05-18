package br.com.mlassakoski.xml.parser.mapper;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;

@Component
public class ElementMapper {

    public StudantsEnum getMap(final String key) {
        HashMap<String, StudantsEnum> map = new HashMap<>();
        map.put("studant", StudantsEnum.STUDANT);
        map.put("name", StudantsEnum.NAME);
        map.put("lastname", StudantsEnum.LASTNAME);
        map.put("phone", StudantsEnum.PHONE);

        return map.get(key);
    }
}
