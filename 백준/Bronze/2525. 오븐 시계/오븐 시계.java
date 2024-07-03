import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String a = br.readLine();
        String b = br.readLine();
        StringTokenizer st = new StringTokenizer(a);
        int hour = Integer.parseInt(st.nextToken());//시
        int min = Integer.parseInt(st.nextToken());//분
        int go = Integer.parseInt(b); //지난시간
        min += go;
        hour += min/60;
        min = min%60;
        hour = hour%24;
        System.out.println(hour + " " + min);


    }
}