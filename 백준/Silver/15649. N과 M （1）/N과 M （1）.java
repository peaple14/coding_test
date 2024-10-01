import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        arr = new int[B];
        visit = new boolean[A];
        DFS(A, B, 0,bw);
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS(int A,int B,int depth,BufferedWriter bw) throws IOException {
        if (depth == B) { //깊이가 같다면
            for (int val : arr) {
                bw.write(val + " ");
            }
            bw.write("\n");
            return;

        }

        for(int i=0;i<A;i++){
            if (!visit[i]) {//방문 안했으면
                visit[i] = true;//방문한것으로 바꾼후
                arr[depth]=i+1;//배열에 그 숫자 넣은후
                BFS(A, B, depth + 1, bw);//출력을 향하여
                visit[i] = false;//재사용 하기위해 false로
            }
        }

    }
}
