import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a= Integer.parseInt(sc.next());
        System.out.println(a==0?"1":fact(a));


    }

    public static long fact(int a){
        if (a == 1) {
            return a;
        } else {
            return fact(a-1)*a;
        }

    }

}
