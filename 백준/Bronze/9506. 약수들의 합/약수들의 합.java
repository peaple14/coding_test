import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            if (n == -1) break;

            int sum = 1; 
            StringBuilder result = new StringBuilder(n + " = 1");

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                    result.append(" + ").append(i);
                }
            }

            if (sum == n) {
                bw.write(result.toString());
                bw.newLine();
            } else {
                bw.write(n + " is NOT perfect.");
                bw.newLine();
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
