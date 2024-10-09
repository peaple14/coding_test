import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static boolean[] visit;
    static int A;

    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        count = 0;

        arr = new int[A];
        visit = new boolean[A];
        DFS(0,0);
        System.out.println(count);
        br.close();
    }

    public static void DFS(int depth, int start) throws IOException {
        if (depth == A) { //퀸을 다 놓았다면
            count++;//갯수추가
            return;

        }

        for (int i = start; i < A; i++) {//9번째칸까지
            if (!visit[i]) {//이번층 도달안했으면
                visit[i] = true; //도달했다고 하고
                arr[depth] = i;
                if (doit(depth, i) == true) {//여기 놓을수 있으면
                    DFS(depth + 1, 0);
                }
                visit[i] = false;
            }
        }

    }

    public static boolean doit(int depth,int num){//몇번째줄 몇번칸
        if (depth == 0) {//0층이면 바로 트루리턴
            return true;
        }
        for (int i = 0; i < depth; i++) {//되는지 확인
            int anum = arr[i];
            if (anum == num || Math.abs(anum - num) == Math.abs(i - depth))//같은열,대각선체크
                return false;
            }
        return true;

    }
}

