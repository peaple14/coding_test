import java.time.LocalDate;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());//개는N걸음뒤에있음
        int M = Integer.parseInt(st.nextToken());//토끼걸음
        int K = Integer.parseInt(st.nextToken());//개걸음
        int count = 0;
        int dog = -N;//개위치
        int rabbit=0;//토끼위치
        while (dog < rabbit) {
            count++;
            rabbit += M;
            dog += K;
        }
        System.out.println(count);;
        br.close();
        bw.flush();
        bw.close();
    }
}


