package br.com.mlassakoski;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mlassakoski.xml.StaxParser;

@SpringBootApplication
public class Application {

    @Autowired
    private StaxParser staxParser;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void init() {
        staxParser.parseXml();
    }
}
