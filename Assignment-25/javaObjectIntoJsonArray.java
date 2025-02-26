import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

public class javaObjectIntoJsonArray {
    static class User {
        public String name;
        public int age;
        public User(String name, int age) { this.name = name; this.age = age; }
    }

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<User> users = Arrays.asList(new User("Ayushi", 22), new User("Pranjal", 19));
        String json = mapper.writeValueAsString(users);
        System.out.println(json);
    }
}
