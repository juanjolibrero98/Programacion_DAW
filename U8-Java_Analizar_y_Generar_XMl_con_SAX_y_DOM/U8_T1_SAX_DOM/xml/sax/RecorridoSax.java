package xml.sax;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class RecorridoSax {
    public static void main(String[] args) {

        try {

            SAXParserFactory spf = SAXParserFactory.newInstance();
            SAXParser saxParser = spf.newSAXParser();
            DefaultHandler yeguadaSax = new YeguadaSax();
            saxParser.parse(new File("yeguada.xml"), yeguadaSax);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
