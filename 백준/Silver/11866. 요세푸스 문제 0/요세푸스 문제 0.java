import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        bw.write("<");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 0; i < a; i++) {
            queue.offer(i+1);
        }
        for (int j = 0; j < a - 1; j++) {
            for (int i = 0; i < b - 1; i++) {
                queue.offer(queue.poll());
            }
            bw.write(queue.poll() + ", ");
        }


        bw.write(queue.poll() + ">");
        bw.flush();
        bw.close();
        br.close();




    }
}
