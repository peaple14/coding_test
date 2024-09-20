import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Block> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            int next = Integer.parseInt(st.nextToken());
            queue.add(new Block(i, next));
        }

        while (!queue.isEmpty()) {
            Block currentBlock = queue.poll();
            bw.write(currentBlock.order + " ");
            int nextMoves = currentBlock.next;
            
            if (queue.isEmpty()) break;

            if (nextMoves > 0) {
                for (int i = 0; i < nextMoves - 1; i++) {
                    queue.addLast(queue.pollFirst());
                }
            } 
            else {
                for (int i = 0; i < Math.abs(nextMoves); i++) {
                    queue.addFirst(queue.pollLast());
                }
            }
        }
        bw.flush();
        bw.close();
    }
}

class Block {
    int order;
    int next;

    Block(int order, int next) {
        this.order = order;
        this.next = next;
    }
}
