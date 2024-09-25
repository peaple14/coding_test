import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] lqt = new int[n];
        int[] current = new int[n];
        
        StringTokenizer tok1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            lqt[i] = Integer.parseInt(tok1.nextToken());
        }

        StringTokenizer tok2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            current[i] = Integer.parseInt(tok2.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (lqt[i] == 0) {
                queue.addFirst(current[i]);
            }
        }

        StringTokenizer tok3 = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            queue.add(Integer.parseInt(tok3.nextToken()));
            bw.write(queue.pollFirst() + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
