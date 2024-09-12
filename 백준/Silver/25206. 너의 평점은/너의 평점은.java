import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double a = 0.0;
        double b = 0.0;
        double sum1 = 0.0; // 전공 과목별 합
        double sum2 = 0.0; // 학점의 총합
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken(); // 과목명 패스
            a = Double.parseDouble(st.nextToken());
            b = grade(st.nextToken());
            if (b == 10.0) {
                continue;
            }
            sum1 += a * b;
            sum2 += a;
        }
        System.out.printf("%.6f", sum1 / sum2);
    }

    public static double grade(String grade) {
        if (grade.equals("A+")) {
            return 4.5;
        } else if (grade.equals("A0")) {
            return 4.0;
        } else if (grade.equals("B+")) {
            return 3.5;
        } else if (grade.equals("B0")) {
            return 3.0;
        } else if (grade.equals("C+")) {
            return 2.5;
        } else if (grade.equals("C0")) {
            return 2.0;
        } else if (grade.equals("D+")) {
            return 1.5;
        } else if (grade.equals("D0")) {
            return 1.0;
        } else if (grade.equals("F")) {
            return 0.0;
        } else {
            return 10.0;
        }
    }
}
