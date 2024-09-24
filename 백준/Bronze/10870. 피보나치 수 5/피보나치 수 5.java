import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a= Integer.parseInt(sc.next());
        System.out.println(fib(a));

    }

    public static long fib(int num){
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fib(num-1)+fib(num-2);

    }

}
