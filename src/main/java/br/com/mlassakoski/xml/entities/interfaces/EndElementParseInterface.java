package br.com.mlassakoski.xml.entities.interfaces;


import javax.xml.stream.events.EndElement;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;

import java.util.Deque;

public interface EndElementParseInterface {
    void parse(final EndElement startElement, final StudantsEnum tag, final Deque<StudantsEnum> stack);
}
