import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class Service {
    @ImportantMethod(level = "HIGH")
    public void criticalFunction() {}

    @ImportantMethod(level = "MEDIUM")
    public void normalFunction() {}
}

public class markImpMethods {
    public static void main(String[] args) throws Exception {
        for (Method method : Service.class.getMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod imp = method.getAnnotation(ImportantMethod.class);
                System.out.println(method.getName() + " - Importance: " + imp.level());
            }
        }
    }
}
