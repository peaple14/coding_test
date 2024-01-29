import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());
        long b = 1;

        for (int i = 1; i <= a; i++) {
            b *= i;
            b %= 1000000000;
            while (b % 10 == 0)
                b /= 10;
        }

        System.out.println(b % 10);
    }
}
