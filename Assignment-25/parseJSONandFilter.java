import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class parseJSONandFilter {
	static class Student {
		public String name;
		public int age;
		public List<String> subjects;

		public Student() {}
	}

	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		String jsonArray = new String(Files.readAllBytes(Paths.get("student.json")));

		List<Student> students = mapper.readValue(jsonArray, 
				mapper.getTypeFactory().constructCollectionType(List.class, Student.class));

		List<Student> filteredStudents = students.stream()
				.filter(s -> s.age > 25)
				.collect(Collectors.toList());

		for (Student s : filteredStudents) {
			System.out.println("Name: " + s.name + ", Age: " + s.age + ", Subjects: " + s.subjects);
		}
	}
}
