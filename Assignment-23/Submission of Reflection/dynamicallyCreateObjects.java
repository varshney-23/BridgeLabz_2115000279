import java.lang.reflect.*;

class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class dynamicallyCreateObjects {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Student.class;
        Object student = clazz.getDeclaredConstructor().newInstance();

        Method displayMethod = clazz.getDeclaredMethod("display");
        displayMethod.invoke(student);
    }
}
