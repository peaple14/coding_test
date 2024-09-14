import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Deque<Integer> deque = new LinkedList<>();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case"1":
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case"2":
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case"3":
                    bw.write(!deque.isEmpty() ? deque.pollFirst()+"\n" + "" : "-1\n" );
                    break;
                case"4":
                    bw.write(!deque.isEmpty() ? deque.pollLast() +"\n" : "-1\n" );
                    break;
                case"5":
                    bw.write(deque.size()+"\n" );
                    break;
                case"6":
                    bw.write(deque.isEmpty() ? "1\n" : "0\n");
                    break;
                case"7":
                    bw.write(!deque.isEmpty() ? deque.peekFirst() +"\n" : "-1\n" );
                    break;
                case"8":
                    bw.write(!deque.isEmpty() ? deque.peekLast() +"\n" : "-1\n" );
                    break;
            }

        }

        bw.flush();
        bw.close();
        br.close();

    }
}
