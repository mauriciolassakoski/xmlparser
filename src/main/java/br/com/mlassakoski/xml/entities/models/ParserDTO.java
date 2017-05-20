package br.com.mlassakoski.xml.entities.models;

import javax.xml.stream.events.Characters;

public class ParserDTO {

    private Studant studant;
    private StringBuilder builder;

    public Studant getStudant() {
        return studant;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public void newBuilder() {
        this.builder = new StringBuilder();
    }

    public void addToBuilder(Characters characters) {
        this.builder.append(characters);
    }

    public void newStudant() {
        this.studant = new Studant();
    }

    public void clearBuilder() {
        this.builder.setLength(0);
    }
}
