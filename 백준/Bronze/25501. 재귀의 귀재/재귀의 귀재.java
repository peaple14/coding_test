import java.io.*;
import java.util.*;

public class Main {

    static int real = 0;

    public static int recursion(String a, int l, int r) {
        real++;
        if (l >= r) {
            return 1;
        } else if (a.charAt(l) != a.charAt(r)) {
            return 0;
        } else {
            return recursion(a, l + 1, r - 1);
        }

    }

    public static int isPalindrome(String a) {
        return recursion(a, 0, a.length() - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String a = br.readLine();
            bw.write(isPalindrome(a) + " " + real+"\n");
            real=0;
        }

        bw.flush();
        bw.close();
        br.close();
    }


}
