import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer;

        while (true) {
            tokenizer = new StringTokenizer(reader.readLine());

            int A = Integer.parseInt(tokenizer.nextToken());
            int B = Integer.parseInt(tokenizer.nextToken());
            int C = Integer.parseInt(tokenizer.nextToken());

            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            if (isValidTriangle(A, B, C)) {
                System.out.println(determineTriangleType(A, B, C));
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static boolean isValidTriangle(int A, int B, int C) {
        return A < B + C && B < A + C && C < A + B;
    }

    private static String determineTriangleType(int A, int B, int C) {
        if (A == B && B == C) {
            return "Equilateral";
        } else if (A == B || A == C || B == C) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
