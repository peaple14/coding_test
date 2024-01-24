import java.time.LocalDate;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        LocalDate now = LocalDate.now();
        bw.write(String.valueOf(now));

        br.close();
        bw.flush();
        bw.close();
    }
}


