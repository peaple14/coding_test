import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count=0;
        HashSet<String> hs = new HashSet<>();
        String say;
        for (int i = 0; i < N; i++) {
            say = br.readLine();

            if (say.equals("ENTER")) {
                hs.clear();
                continue;
            }

            if (!hs.contains(say)) {
                hs.add(say);
                count++;
            }
        }

        System.out.println(count);

    }

}