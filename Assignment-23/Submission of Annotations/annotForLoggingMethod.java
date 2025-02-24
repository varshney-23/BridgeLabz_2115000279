import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {}

class TimeTracker {
    @LogExecutionTime
    public void fastMethod() {
        System.out.println("Fast execution.");
    }

    @LogExecutionTime
    public void slowMethod() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Slow execution.");
    }
}

public class annotForLoggingMethod {
    public static void main(String[] args) throws Exception {
        for (Method method : TimeTracker.class.getMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long start = System.nanoTime();
                method.invoke(new TimeTracker());
                long end = System.nanoTime();
                System.out.println(method.getName() + " Execution Time: " + (end - start) + " ns");
            }
        }
    }
}
