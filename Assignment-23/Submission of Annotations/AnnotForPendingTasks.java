import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class Project {
    @Todo(task = "Implement login", assignedTo = "Ayushi", priority = "HIGH")
    public void login() {}

    @Todo(task = "Fix UI bugs", assignedTo = "Om", priority = "LOW")
    public void fixUI() {}
}

public class AnnotForPendingTasks {
    public static void main(String[] args) throws Exception {
        for (Method method : Project.class.getMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println(method.getName() + " - " + todo.task() + " (Assigned to: " + todo.assignedTo() + ", Priority: " + todo.priority() + ")");
            }
        }
    }
}
