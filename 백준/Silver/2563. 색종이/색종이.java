import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int A = Integer.parseInt(br.readLine());//색종이수
        int x,y;
        int sum = 0;
        int [][] a = new int [100][100];

        for (; A > 0; A--) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y= Integer.parseInt(st.nextToken());

            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    if (a[i][j] == 0) { // 새로 덮는 경우만 카운트
                        a[i][j] = 1;
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}