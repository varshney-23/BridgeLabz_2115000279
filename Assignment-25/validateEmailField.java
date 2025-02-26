import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class validateEmailField {
	public static void main(String[] args) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		String json = new String(Files.readAllBytes(Paths.get("data.json")));

		List<Map<String, Object>> dataList = mapper.readValue(json, List.class);

		for (Map<String, Object> data : dataList) {
			String email = data.get("email").toString();
			if (isValidEmail(email)) {
				System.out.println("Valid email: " + email);
			} else {
				System.out.println("Invalid email: " + email);
			}
		}
	}

	private static boolean isValidEmail(String email) {
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		return Pattern.compile(emailRegex).matcher(email).matches();
	}
}
