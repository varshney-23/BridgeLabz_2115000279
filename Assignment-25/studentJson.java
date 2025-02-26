import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Arrays;
import java.util.Map;

public class studentJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            Map<String, Object> student = Map.of(
                    "name", "Ayushi",
                    "age", 22,
                    "subjects", Arrays.asList("Mathematics", "Data Science", "Java")
            );

            mapper.writeValue(new File("student.json"), student);

            System.out.println("JSON file created: student.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

