package br.com.mlassakoski.xml.entities.interfaces;


import javax.xml.stream.events.EndElement;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.models.Studant;

import java.util.Deque;

public interface EndElementParseInterface {
    void parse(final EndElement startElement, final StudantsEnum tag, Studant studant, final Deque<StudantsEnum> stack, StringBuilder builder);
}
