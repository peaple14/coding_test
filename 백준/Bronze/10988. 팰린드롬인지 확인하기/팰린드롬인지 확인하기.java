import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        System.out.println(str.equals(sb.toString()) ? "1" : "0");
    }
}