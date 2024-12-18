import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        writer.write(String.valueOf(a * b));
        
        writer.flush();  
        reader.close();
        writer.close();
    }
}
