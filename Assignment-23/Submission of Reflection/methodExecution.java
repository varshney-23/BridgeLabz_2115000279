import java.lang.reflect.*;

class TimeMeasure {
    public void slowMethod() throws InterruptedException {
        Thread.sleep(200);
    }
}

public class methodExecution {
    public static void main(String[] args) throws Exception {
        Method method = TimeMeasure.class.getMethod("slowMethod");
        long start = System.nanoTime();
        method.invoke(new TimeMeasure());
        long end = System.nanoTime();
        System.out.println("Execution time: " + (end - start) + " ns");
    }
}
