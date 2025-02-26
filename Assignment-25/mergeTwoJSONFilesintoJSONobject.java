import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class mergeTwoJSONFilesintoJSONobject {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		String json1 = new String(Files.readAllBytes(Paths.get("file1.json")));
		Map<String, Object> data1 = mapper.readValue(json1, Map.class);

		String json2 = new String(Files.readAllBytes(Paths.get("file2.json")));
		Map<String, Object> data2 = mapper.readValue(json2, Map.class);

		List<Map<String, Object>> mergedList = new ArrayList<>();
		mergedList.add(data1);
		mergedList.add(data2);

		String mergedJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedList);
		Files.write(Paths.get("merged.json"), mergedJson.getBytes());

		System.out.println("Merged JSON saved in merged.json");
	}
}
