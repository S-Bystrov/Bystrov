package homework_15.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DomParser {
    private static final String PATH = "resources/homework15/Students";

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        /*InputStream resources = ClassLoader.getSystemResourceAsStream(PATH);*/ //Exception in thread "main" java.lang.IllegalArgumentException: InputStream cannot be null
        // правой кнопкой по файлу - CopyRelativePath - скорее всего путь к файлу неверный
        Document document = db.parse(new File(PATH));

        List<Student> students = new ArrayList<>();
        NodeList nodeList = document.getDocumentElement().getChildNodes();

                // стоит все же выносить в отдельные методы куски логики
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node instanceof Element) {
                Student student = new Student();

                NodeList childNodes = node.getChildNodes();
                for (int j = 0; j < childNodes.getLength(); j++) {
                    Node cNode = childNodes.item(j);

                    if (cNode instanceof Element) {
                        String content = cNode.getLastChild().
                                getTextContent().trim();
                        switch (cNode.getNodeName()) {
                            case "name":
                                student.setName(content);
                                break;
                            case "surname":
                                student.setSurname(content);
                                break;
                            case "group":
                                student.setGroup(Integer.parseInt(content));
                                break;
                            case "faculty":
                                student.setFaculty(content);
                                break;
                        }
                    }
                }
                students.add(student);
            }
        }
        // students.forEach(System.out::println); твой способ не ошибка
        students.forEach(student -> System.out.println(student));
    }
}
