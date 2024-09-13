import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "1":
                    stack.push(Integer.valueOf(st.nextToken()));
                    break;
                case "2":
                    if (!stack.empty()) {
                        bw.write(stack.pop()+"\n");
                    }else {
                        bw.write("-1" + "\n");
                    }
                    break;
                case "3":
                    bw.write(stack.size()+"\n");
                    break;
                case "4":
                    bw.write((stack.empty() ?"1":"0")+ "\n" );
                    break;
                case "5":
                    if (!stack.empty()) {
                        bw.write(stack.peek()+"\n");
                    }else {
                        bw.write("-1" + "\n");
                    }
                    break;

            }
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
