import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int a=0;
        for (int i = 0; i < n; i++) {
            a= Integer.parseInt(br.readLine());
            bw.write(a / 25 + " ");
            a%=25;
            bw.write(a / 10 + " ");
            a%=10;
            bw.write(a / 5 + " ");
            a%=5;
            bw.write(a + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}