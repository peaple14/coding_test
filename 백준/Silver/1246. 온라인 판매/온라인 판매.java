import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] c = new int[b];
        for (int i = 0; i < b; i++) {
            c[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(c);
        int[] d = new int[b];
        int best = 0;
        int price = 0;
        if (b - a <= 0) {
            for (int j = b-1; j >= 0; j--) {
                if (best < c[j] * (b-j)) {
                    best = c[j] * (b-j);
                    price = c[j];
                }
            }
        } else {
            for (int j = b-1; j >= b-a; j--) {
                if (best < c[j] * (b-j)) {
                    best = c[j] * (b-j);
                    price = c[j];
                }
            }
        }
        if (b == 1) {
            best = c[0];
            price = c[0];
        }

        bw.write(price + " " + best);
        br.close();
        bw.flush();
        bw.close();
    }
}


