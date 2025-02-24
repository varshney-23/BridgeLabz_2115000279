import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class accessAndModifyStaticFields {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);

        System.out.println("Old API Key: " + field.get(null));
        field.set(null, "NEW_KEY");
        System.out.println("Updated API Key: " + field.get(null));
    }
}
