import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt((br.readLine()));
        int[] N = new int[num+1];
        N[0] = N[1] = 0;
        for(int i = 2; i <= num; i++) {
            N[i] = N[i-1] + 1;
            if(i % 2 == 0) N[i] = Math.min(N[i], N[i/2] + 1);
            if(i % 3 == 0) N[i] = Math.min(N[i], N[i/3] + 1);
        }
        System.out.println(N[num]);
        br.close();
     }
    }
//N[10]
//N[10]= min(N[5],N[9])+1
//N[9]=min(N[3],N[8])+1
//N[8]=min(N[4],N[7])+1
//N[7]=N[6]+1
//N[6]=min(N[3],N[5])+1
//N[5]=N[4]+1
//N[4]=min(N[1],N[3])+1
//N[3]=min(N[1],N[2])+1
//N[2]=min(N[1],N[1])+1=1
//N[1] = 0;