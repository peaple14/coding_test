import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine()); 
        String[][] a = new String[n][2];    
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i][0] = st.nextToken();
            a[i][1] = st.nextToken(); 
        }
        
        Arrays.sort(a, (p1, p2) -> Integer.parseInt(p1[0]) - Integer.parseInt(p2[0]));
        
        for (int i = 0; i < n; i++) {
            bw.write(a[i][0] + " " + a[i][1] + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
