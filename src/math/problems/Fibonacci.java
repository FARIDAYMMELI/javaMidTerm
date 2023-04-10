package math.problems;
import java.util.Arrays;
public class Fibonacci {
    public static int[] fibonacci(int n) {
        int fib[] = new int[n];
        int f1 = 0, f2 = 1, tmp;
        for (int i = 0; i < n; i++) {
            fib[i] = f1;
            tmp = f1 + f2;
            f1 = f2;
            f2 = tmp;
        }
        return fib;
    }

    /*
         Write 40 Fibonacci numbers with java.
         0,1,1,2,3,5,8,13
        */
    public static void main(String[] args) {

        int[] fib = fibonacci(40);
        System.out.println(Arrays.toString(fib));
    }
}


