
import java.io.*;
public class Main {

    static int count0 = 0;
    static int count1 = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            doit(a);
            bw.write(count0+ " "+ count1 + "\n");
            count0 = 0;
            count1 = 0;
        }
        br.close();
        bw.flush();
        bw.close();
    }
    public static int doit(int n) {
        int hol = 1; //홀수번빼면1 짝수번째면2
        int a=0;
        int b=1;
        int c=1;
        int d=1;
        if (n == 0) {
            count0 = 1;
            count1 = 0;
            return 1;
        }
        if (n == 1) {
            count0 = 0;
            count1 = 1;
            return 1;
        }
        if (n == 2) {
            count0 = 1;
            count1 = 1;
            return 1;
        } else {
            for (int i = 2; i < n; i++) {
                if (hol == 1) {
                    a = a + c;
                    b = b + d;
                    hol = 2;//다음은 짝수번호임
                } else {
                    c = a+c;
                    d = d+b;
                    hol = 1; //다음은 홀수번호임
                }
            }
            if (hol == 1) {
                count0 = c;
                count1 = d;
            } else {
                count0 = a;
                count1 = b;
            }
        }
        return 1;
    }
}


