import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer str1 = new StringTokenizer(a,"0");
        StringTokenizer str2 = new StringTokenizer(a,"1");
        int a1 = str1.countTokens();
        int a2 = str2.countTokens();
        int count=Math.min(a1,a2);
        System.out.println(count);
     }
    }
