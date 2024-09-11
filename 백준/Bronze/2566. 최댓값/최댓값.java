import javax.management.StringValueExp;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int x=0;//몇행
        int y=0;//몇열
        int z=0;//크기
        int [][] a = new int [9][9];
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if (a[i][j] > z) {
                    x=i;
                    y=j;
                    z=a[i][j];
                }
            }
        }
        System.out.println(z);
        x++;
        y++;
        System.out.println(x +" "+ y);


    }
}