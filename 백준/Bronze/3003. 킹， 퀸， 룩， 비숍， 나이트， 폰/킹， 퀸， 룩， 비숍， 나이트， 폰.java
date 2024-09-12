import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = 1;
        int b = 1;
        int c = 2;
        int d = 2;
        int e = 2;
        int f = 8;

        a = a - Integer.parseInt(st.nextToken());
        b = b - Integer.parseInt(st.nextToken());
        c = c - Integer.parseInt(st.nextToken());
        d = d - Integer.parseInt(st.nextToken());
        e = e - Integer.parseInt(st.nextToken());
        f = f - Integer.parseInt(st.nextToken());

        bw.write(a + " ");
        bw.write(b + " ");
        bw.write(c + " ");
        bw.write(d + " ");
        bw.write(e + " ");
        bw.write(f + "");



        bw.flush();
        bw.close();
        br.close();


    }
}