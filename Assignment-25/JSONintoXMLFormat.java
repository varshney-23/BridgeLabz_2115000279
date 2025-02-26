import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JSONintoXMLFormat {
    static class Students {
        public List<Student> student;
    }

    static class Student {
        public String name;
        public String email;
        public int age;
        public String city;
    }

    public static void main(String[] args) throws Exception {
        ObjectMapper jsonMapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        String json = new String(Files.readAllBytes(Paths.get("data.json")));
        List<Student> students = jsonMapper.readValue(json, jsonMapper.getTypeFactory().constructCollectionType(List.class, Student.class));

        Students studentWrapper = new Students();
        studentWrapper.student = students;

        String xml = xmlMapper.writeValueAsString(studentWrapper);
        System.out.println(xml);
    }
}
