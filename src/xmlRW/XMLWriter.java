package xmlRW;




import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public class XMLWriter {

    public static void writeStudentsToXML(List<Student> students, String filePath) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();

            Element root = doc.createElement("students");
            doc.appendChild(root);

            for (Student student : students) {
                Element studentElement = doc.createElement("student");

                Element id = doc.createElement("id");
                id.appendChild(doc.createTextNode(String.valueOf(student.getId())));
                studentElement.appendChild(id);

                Element name = doc.createElement("name");
                name.appendChild(doc.createTextNode(student.getName()));
                studentElement.appendChild(name);

                Element marks = doc.createElement("marks");
                marks.appendChild(doc.createTextNode(String.valueOf(student.getMarks())));
                studentElement.appendChild(marks);

                root.appendChild(studentElement);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filePath));
            transformer.transform(source, result);

            System.out.println("XML file written to: " + filePath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
