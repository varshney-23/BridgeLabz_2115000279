import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Software {
    @BugReport(description = "NullPointerException occurs randomly.")
    @BugReport(description = "Performance issue in large data sets.")
    public void process() {
        System.out.println("Processing...");
    }
}

public class usingARepeatable {
    public static void main(String[] args) throws Exception {
        Method method = Software.class.getMethod("process");
        BugReports bugReports = method.getAnnotation(BugReports.class);
        for (BugReport report : bugReports.value()) {
            System.out.println("Bug: " + report.description());
        }
    }
}
