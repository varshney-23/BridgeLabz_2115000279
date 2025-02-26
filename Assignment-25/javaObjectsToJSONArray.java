import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class javaObjectsToJSONArray {
   
    static class Student {
        public String name;
        public int age;
        public List<String> subjects;

        public Student(String name, int age, List<String> subjects) {
            this.name = name;
            this.age = age;
            this.subjects = subjects;
        }

        public Student() {}
    }

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        
        Student student = new Student("Ayushi", 22, List.of("Mathematics", "Data Science", "Java"));
        
        String json = mapper.writeValueAsString(student);

        System.out.println(json);
    }
}
