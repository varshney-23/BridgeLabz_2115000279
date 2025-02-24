
import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {
    @JsonField(name = "user_name")
    String username;

    User(String username) {
        this.username = username;
    }
}

public class customSerializationAnnot {
    public static void main(String[] args) throws Exception {
        User user = new User("Ayushi");

        Map<String, String> jsonMap = new HashMap<>();
        for (Field field : User.class.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                jsonMap.put(annotation.name(), (String) field.get(user));
            }
        }
        System.out.println(jsonMap);
    }
}
