package homework_15.task1;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SaxParser {
    private static final String PATH = "resources/homework15/Students";

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();

        SAXHandler handler = new SAXHandler();
        /*InputStream resources = ClassLoader.getSystemResourceAsStream(PATH);*/ //такая же ошибка
        // скорее всего путь к файлу неверный
        parser.parse(new File(PATH), handler);

        List<Student> studList = handler.getStudList();
        studList.forEach(student -> System.out.println(student));
    }
}
