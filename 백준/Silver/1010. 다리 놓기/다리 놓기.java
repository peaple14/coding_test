import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
        
        for(int i=0; i<N; i++) {
        	st = new StringTokenizer(br.readLine()," ");
            double n = Integer.parseInt(st.nextToken());
            double m = Integer.parseInt(st.nextToken());
            double result = 0;
            double a = 1;
            double b = 1;
            for(double j=m; j>m-n; j--) {
                   a *= j;
               }    
            
            for(double k=n; k>0; k--) {
                b *= k;
            }
               result = a/b;
               System.out.printf("%.0f\n",result); 
    }
}

}