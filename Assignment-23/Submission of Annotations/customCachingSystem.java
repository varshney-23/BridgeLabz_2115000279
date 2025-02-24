import java.lang.annotation.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class ExpensiveComputation {
    private static final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int factorial(int n) {
        if (cache.containsKey(n)) {
            System.out.println("Returning cached result for: " + n);
            return cache.get(n);
        }

        int result = (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
        cache.put(n, result);
        System.out.println("Computed and cached result for: " + n);
        return result;
    }
}

public class customCachingSystem {
    public static void main(String[] args) throws Exception {
        ExpensiveComputation obj = new ExpensiveComputation();

        System.out.println("Factorial of 5: " + obj.factorial(5));
        System.out.println("Factorial of 5 (cached): " + obj.factorial(5));
        System.out.println("Factorial of 6: " + obj.factorial(6));
    }
}
