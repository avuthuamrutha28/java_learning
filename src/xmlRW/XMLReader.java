package xmlRW;



import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import java.io.File;

public class XMLReader {

    public static void readStudentsFromXML(String filePath) {
        try {
            File xmlFile = new File(filePath);

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(xmlFile);

            NodeList nodeList = doc.getElementsByTagName("student");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element student = (Element) node;

                    int id = Integer.parseInt(student.getElementsByTagName("id").item(0).getTextContent());
                    String name = student.getElementsByTagName("name").item(0).getTextContent();
                    int marks = Integer.parseInt(student.getElementsByTagName("marks").item(0).getTextContent());

                    System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

