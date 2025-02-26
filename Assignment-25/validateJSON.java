import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

public class validateJSON {
    public static void main(String[] args) {
        String json = "{\"name\": \"ayushi\", \"age\": 22}";
        ObjectMapper mapper = new ObjectMapper();

        try {
         
            Map<String, Object> map = mapper.readValue(json, Map.class);

            if (map.containsKey("name") && map.containsKey("age")) {
                System.out.println("Valid JSON Structure");
            } else {
                System.out.println("Invalid JSON Structure");
            }
        } catch (Exception e) {
            System.out.println("Invalid JSON Format");
        }
    }
}
