import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String [][] a = new String [5][15];

        for (int i = 0; i < 5; i++) {
            String line = br.readLine();
            for (int j = 0; j < 15; j++) {
                if (j < line.length()) {
                    a[i][j] = String.valueOf(line.charAt(j));  
                } else {
                    a[i][j] = "";  
                }
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(a[i][j]);
            }
        }



    }
}