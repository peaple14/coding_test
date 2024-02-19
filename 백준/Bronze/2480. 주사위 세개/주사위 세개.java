import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (a == b && b == c) {
            bw.write(Integer.toString(10000 + a*1000));
        } else if (a == b) {
            bw.write(Integer.toString(1000 + a*100));
        }else if (b == c) {
            bw.write(Integer.toString(1000 + b*100));
        }else if (a == c) {
            bw.write(Integer.toString(1000 + a*100));
        }else  {
            int t = 0;
            t = a<b ? b:a;
            t = t<c ? c:t;
            bw.write(Integer.toString( t*100));
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
