package br.com.mlassakoski.xlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import br.com.mlassakoski.xlsx.parser.XlsxParserReader;
import com.monitorjbl.xlsx.StreamingReader;
import lombok.extern.log4j.Log4j;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Log4j
@Component
public class XlsxParser {

    @Autowired
    private XlsxParserReader parserReader;

    public void parse() {

        try {
            final String fileName = this.getClass().getClassLoader().getResource("files/studants.xlsx").getFile();
            final InputStream inputStream = new FileInputStream(new File(fileName));
            final Workbook workbook = getWorkBook(inputStream);

            log.info("Starting import");
            parserReader.read(workbook);
            log.info("Import finished");

            workbook.close();
            inputStream.close();
        } catch (final Exception e) {
            log.debug("Exception found! -> " + e);
        }
    }

    private Workbook getWorkBook(final InputStream inputStream) {
        return StreamingReader.builder()
                .rowCacheSize(100)
                .bufferSize(4096)
                .open(inputStream);
    }
}
