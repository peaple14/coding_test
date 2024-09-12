import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[30];
        int x=0;
        for (int i = 0; i < 28; i++) {
            x = Integer.parseInt(br.readLine());
            a[x-1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
            }
        }


    }
}