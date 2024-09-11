import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int A = Integer.parseInt(br.readLine());//색종이수
        int x, y;
        int sum = 0;
        int[][] a = new int[100][100];

        for (; A > 0; A--) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    a[i][j] = 1;
                }
            }
        }


        for (int i = 0; i < 100; i++) { 
            for (int j = 0; j < 100; j++) {
                if (a[i][j] == 1) {
                    if (i == 0 || a[i - 1][j] == 0) { // 상
                        sum++;
                    }
                    if (i == 99 || a[i + 1][j] == 0) { // 하
                        sum++;
                    }
                    if (j == 0 || a[i][j - 1] == 0) { // 좌
                        sum++;
                    }
                    if (j == 99 || a[i][j + 1] == 0) { // 우
                        sum++;
                    }
                }
            }
        }

        System.out.println(sum);







    }
}
