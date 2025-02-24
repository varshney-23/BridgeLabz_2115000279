import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class SecureService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }
}

public class roleBasedAccessCtrl {
    public static void main(String[] args) throws Exception {
        String userRole = "USER";

        Method method = SecureService.class.getMethod("adminTask");
        RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
        if (roleAllowed.value().equals(userRole)) {
            method.invoke(new SecureService());
        } else {
            System.out.println("Access Denied!");
        }
    }
}
