package br.com.mlassakoski.xml.entities.interfaces;

import java.util.Deque;

import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.models.Studant;

public interface StartElementParseInterface {

    void parse(final StartElement startElement, final StudantsEnum tag, final Studant studant,
            final Deque<StudantsEnum> stack);
}
