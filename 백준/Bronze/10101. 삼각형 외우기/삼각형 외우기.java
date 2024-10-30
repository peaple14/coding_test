import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (!isValid(a, b, c)) {
            System.out.print("Error");
        } else {
            System.out.print(getType(a, b, c));
        }
    }

    private static boolean isValid(int a, int b, int c) {
        return (a + b + c) == 180;
    }

    private static String getType(int a, int b, int c) {
        if (a == 60 && b == 60 && c == 60) {
            return "Equilateral";
        } else if (a == b || b == c || c == a) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
