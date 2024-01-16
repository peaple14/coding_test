import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        long a = 0;
        long b = 0;
        long c = 0;
        long d = 0;
        st = new StringTokenizer(br.readLine(), " ");
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        c = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        long m = a*lcm(b,d)/b + c*lcm(b,d)/d;
        long j = lcm(b, d);
        if (gcd(m, j) != 1) {
            long k = 0;
            k = gcd(m, j);
            m = m / k;
            j = j / k;
        }
        bw.write(m+" "+j);
        br.close();
        bw.flush();
        bw.close();

    }

    public static long lcm(long a, long b) {
        return ( a * b) / gcd(a, b);
    }

    //유클리 호제법
    public static long gcd(long a, long b) {
        long r = 0;
        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

