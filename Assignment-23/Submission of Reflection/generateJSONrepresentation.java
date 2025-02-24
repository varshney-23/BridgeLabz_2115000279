import java.lang.reflect.*;

class Product {
    public String name = "Laptop";
    public int price = 50000;
}

public class generateJSONrepresentation {
    public static String toJson(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder("{");
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\": \"").append(field.get(obj)).append("\", ");
        }
        json.setLength(json.length() - 2);
        return json.append("}").toString();
    }

    public static void main(String[] args) throws Exception {
        Product product = new Product();
        System.out.println(toJson(product));
    }
}
