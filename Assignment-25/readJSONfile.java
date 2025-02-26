import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class readJSONfile {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = new String(Files.readAllBytes(Paths.get("data.json")));

        List<Map<String, Object>> users = mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, Map.class));

        for (Map<String, Object> user : users) {
            System.out.println(user);
        }
    }
}
