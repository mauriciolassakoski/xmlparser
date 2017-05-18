package br.com.mlassakoski.xml.entities.interfaces;


import br.com.mlassakoski.xml.entities.enums.StudantsEnum;

import javax.xml.stream.events.StartElement;

public interface StartElementParseInterface {
    void parse(final StartElement startElement, final StudantsEnum tag);
}
