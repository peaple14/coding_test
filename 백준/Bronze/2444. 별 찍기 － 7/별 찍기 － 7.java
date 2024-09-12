import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            for (int x = 0; x < a - i; x++) {
                bw.write(" ");
            }
            for (int y = 0; y < 1 + 2 * (i - 1); y++) {
                bw.write("*");
            }
            bw.write("\n");
        }


        for (int i = a - 1; i > 0; i--) {

            for (int x = 0; x < a - i; x++) {
                bw.write(" ");
            }
            for (int y = 0; y < 1 + 2 * (i - 1); y++) {
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
