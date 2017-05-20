package br.com.mlassakoski.xml.entities.interfaces;

import java.util.Deque;

import javax.xml.stream.events.StartElement;

import br.com.mlassakoski.xml.entities.enums.StudantsEnum;
import br.com.mlassakoski.xml.entities.models.ParserDTO;

public interface StartElementParseInterface {

    void parse(final StartElement startElement, final StudantsEnum tag,
               final Deque<StudantsEnum> stack, ParserDTO parserDTO);
}
