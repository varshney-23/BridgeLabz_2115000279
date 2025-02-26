import java.util.Map;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class mergeTwoJsonObj {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json1 = "{\"name\": \"ayushi\", \"age\": 22}";
        String json2 = "{\"email\": \"ayushi@example.com\", \"city\": \"Banglore\"}";

        Map<String, Object> map1 = mapper.readValue(json1, Map.class);
        Map<String, Object> map2 = mapper.readValue(json2, Map.class);
        
        map1.putAll(map2);

        String mergedJson = mapper.writeValueAsString(map1);
        System.out.println(mergedJson);
    }
}
