import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static boolean[] visit;
    static int A,B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());

        arr = new int[B];
        visit = new boolean[A];
        DFS(0,0,bw);
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS(int depth, int start,BufferedWriter bw) throws IOException {
        if (depth == B) { //깊이가 같다면
            for (int val : arr) {
                bw.write(val + " ");
            }
            bw.write("\n");
            return;

        }

        for (int i = start; i < A; i++) {//시작부분 변경

                visit[i] = true;
                arr[depth] = i + 1;
                DFS(depth + 1, i,bw);
                visit[i] = false;

        }

    }
}
