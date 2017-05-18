package br.com.mlassakoski.xml.entities.interfaces;


import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;

public interface EndElementParseInterface {
    void parse(final EndElement startElement, final StudantsEnum tag);
}
