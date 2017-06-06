package br.com.mlassakoski.xlsx.parser;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Log4j
@Component
public class XlsxParserReader {

    public void read(final Workbook workbook) {

        if (workbook != null) {
            final Sheet sheet = workbook.getSheetAt(0);

            for (final Row row : sheet) {

                parseRow(row);
            }
        }
    }

    public void parseRow(final Row row) {

        for (final Cell cell : row) {

            try {
                // do something
            } catch (final Exception e) {
                log.debug("Exception found! -> " + e);
            }
        }
    }
}
