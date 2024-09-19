import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int pow = 1;
        int result = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            char c = a.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (c - 55) * pow;
            } else {
                result += (c - 48) * pow;
            }
            pow *= b;
        }
        System.out.println(result);

        br.close();
    }
}
