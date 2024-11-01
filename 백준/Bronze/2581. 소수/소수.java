import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        List<Integer> primes = new ArrayList<>();
        int sum = 0;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                primes.add(i);
                sum += i;
            }
        }

        if (primes.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(primes.get(0)); 
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false; // 1 이하의 수는 소수가 아님
        if (num <= 3) return true;  // 2와 3은 소수

        if (num % 2 == 0 || num % 3 == 0) return false; // 2 또는 3의 배수는 소수가 아님

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
