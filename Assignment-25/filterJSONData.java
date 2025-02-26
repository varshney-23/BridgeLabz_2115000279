import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class filterJSONData {
    static class User {
    	public String name;
		public int age;
		public List<String> subjects;

		public User() {}
    }

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String json = new String(Files.readAllBytes(Paths.get("student.json")));
        List<User> users = mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, User.class));

        List<User> filteredUsers = users.stream().filter(u -> u.age > 25).collect(Collectors.toList());
        System.out.println(mapper.writeValueAsString(filteredUsers));
    }
}
