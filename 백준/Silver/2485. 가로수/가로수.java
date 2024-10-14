import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int minDivisor = 0;
        int sum = 0;

        for (int i = 0; i < N; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i < N; ++i) {
            int distance = arr[i] - arr[i - 1];
            minDivisor = gcd(distance, minDivisor);
        }

        for (int i = 1; i < N; ++i) {
            sum += (arr[i] - arr[i - 1]) / minDivisor - 1;
        }

        System.out.println(sum);
    }

    static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
