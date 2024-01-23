import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken()); //버스기회
        int T = Integer.parseInt(st.nextToken()); //버스도착시간
        int result = -1; //결과값
        int first = 1; //첫주회
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken()); //시작
            int interval = Integer.parseInt(st.nextToken()); //간격
            int count = Integer.parseInt(st.nextToken()); //대수

            for (int j = 0; j < count; j++) {
                if (T > start) {
                    start = start + interval;
                } else if (T == start) {
                    result = 0;
                    i = N;
                    break;
                } else if (first == 1) {
                    first = 0;
                    result = start - T;
                    break;
                } else {
                    if (result != -1 && result > start - T) {
                        result = start - T;
                    }
                }
            }

        }
        System.out.println(result);
        br.close();
//        bw.flush();
//        bw.close();
    }
}


