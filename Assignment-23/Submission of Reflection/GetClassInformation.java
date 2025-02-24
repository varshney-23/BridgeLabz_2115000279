
import java.lang.reflect.*;

public class GetClassInformation {
    public static void main(String[] args) throws ClassNotFoundException {
        String className = "java.util.ArrayList";  // Example class, change as needed
        Class<?> clazz = Class.forName(className);

        System.out.println("Class: " + clazz.getName());

        System.out.println("\nMethods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }

        System.out.println("\nFields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }
    }
}
