import java.lang.reflect.*;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class dynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Method method = MathOperations.class.getMethod("add", int.class, int.class);

        int result = (int) method.invoke(obj, 10, 5);
        System.out.println("Result: " + result);
    }
}
