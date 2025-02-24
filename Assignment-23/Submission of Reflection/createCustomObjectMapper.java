import java.lang.reflect.*;
import java.util.*;

class User {
    public String name;
    public int age;
}

public class createCustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            if (properties.containsKey(field.getName())) {
                field.setAccessible(true);
                field.set(obj, properties.get(field.getName()));
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Ayushi");
        data.put("age", 23);

        User user = toObject(User.class, data);
        System.out.println("User: " + user.name + ", Age: " + user.age);
    }
}
