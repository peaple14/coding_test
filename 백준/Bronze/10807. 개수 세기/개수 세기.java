import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>(N);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) { //배열 복습용
            list.add(Integer.valueOf(st.nextToken()));
        }
        int v = Integer.parseInt(br.readLine());
        int count = 0;
        for (int num : list) {
            if (num == v) {
                count++;
            }
        }
        System.out.println(count);


    }
}