import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        br.readLine();
        st = new StringTokenizer(br.readLine());
        int a = 1;
        int b=0;
        boolean nicesad = true;

        while (st.hasMoreTokens()) {
            b = Integer.parseInt(st.nextToken());
            if (b == a) {
                a++;
                while (!stack.empty() && stack.peek() == a) {
                    stack.pop();
                    a++;
                }
            }else{
                stack.push(b);
            }
        }
        while (!stack.empty()) {
            if (a == stack.peek()) {
                a++;
                stack.pop();
            } else {
                nicesad = false;
                break;
            }
        }
        System.out.println(nicesad ? "Nice" : "Sad");
    }
}
