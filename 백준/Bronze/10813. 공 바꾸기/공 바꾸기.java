import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] a = new int[N];
        int z=0;

        for (int i = 0; i < N; i++) {
            a[i] = i+1;
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            z=a[x-1];
            a[x-1] = a[y-1];
            a[y-1]=z;
        }

        for(int k = 0; k < a.length; k++) {
            bw.write(a[k] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}