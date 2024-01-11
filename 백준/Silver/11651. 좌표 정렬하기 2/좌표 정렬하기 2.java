import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int count =Integer.parseInt(br.readLine());
		int[][] a = new int[count][2];
		
		for(int i=0;i<count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			a[i][0]=Integer.parseInt(st.nextToken());
			a[i][1]=Integer.parseInt(st.nextToken());
		}

		Arrays.sort(a, (o1, o2) -> { 
			if(o1[1] == o2[1]) {
				return Integer.compare(o1[0], o2[0]);
			} else {
				return Integer.compare(o1[1], o2[1]);
			}
		});
		
		for(int i=0;i<count;i++) {
			bw.write(a[i][0]+" "+a[i][1]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();


	}

}