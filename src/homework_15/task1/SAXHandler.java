package homework_15.task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

// +
public class SAXHandler extends DefaultHandler {
    private List<Student> studList = new ArrayList<>();
    private Student stud = null;
    private String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "student":
                stud = new Student();
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "student":
                studList.add(stud);
                break;
            case "name":
                stud.setName(content);
                break;
            case "surname":
                stud.setSurname(content);
                break;
            case "group":
                stud.setGroup(Integer.parseInt(content));
                break;
            case "faculty":
                stud.setFaculty(content);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        content = String.copyValueOf(ch, start, length);
    }

    public List<Student> getStudList() {
        return studList;
    }
}
