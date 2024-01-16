import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(br.readLine());
		int[] a = new int[500005];
		int[] m = new int[8005];
		int total=0;

		int middle = 0;
		int most = 0;
		int range = 0;
		int sum = 0;
		for(int i=0;i<a.length;i++) {
		    a[i]=5000;
		}
		for(int i=0; i<count; i++) {
			a[i]=Integer.parseInt(br.readLine());
			sum+=a[i];//평균용
			m[a[i]+4000]++;//최빈값 계산용 음수대비용
		}
		Arrays.sort(a);
		
		//중앙값
		if(count==1) {
			middle = a[0];
		}
		else  {
			middle = a[(count)/2];
		}
		
		//최빈값
		int ist = 1;//가장높은 최빈값중 첫번째인지
		int max = 0;
		for(int j=0;j<8005;j++) {
			if(m[j]>max) max = m[j];
		}
		
		for(int k=0;k<8005;k++) {
			if(m[k] == max) {
				if(ist == 0) {
					most = k;
					break;
				}
				ist = 0;
				most = k;
			}
		}
		most-=4000;//더했던것 빼기
		
		//범위
		if(a[0]<0 && a[count-1]<0) range = a[0] - a[count -1];
		else range = a[count-1] - a[0]; 
		
		range = Math.abs(range);
		bw.write((int)Math.round((double)sum / count)+"\n");
		bw.write(middle+"\n");
		bw.write(most+"\n");
		bw.write(range+"\n");
		br.close();
		bw.flush();
		bw.close();
	}

}
