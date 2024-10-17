import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static int[][] sudoku;//스도쿠
    public static Point[] points;//좌표기록용
    public static int count = 0;//0의갯수
    public static boolean foundSolution = false;//에러방지용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        sudoku = new int[9][9];
        points = new Point[81];

        for (int i = 0; i < 9; i++) {//스도쿠넣기+0갯수세기
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                sudoku[i][j] = Integer.parseInt(st.nextToken());
                if (sudoku[i][j] == 0) {
                    points[count] = new Point(i, j);
                    count++;
                }
            }
        }
        DFS(0,bw);
        bw.flush();
        bw.close();
        br.close();
    }

    public static void DFS( int depth, BufferedWriter bw) throws IOException {
        if (foundSolution) return;
        if (depth == count) { // 깊이가 같다면
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    bw.write(sudoku[i][j] + " ");
                }
                bw.write("\n");
            }
            foundSolution = true;//에러방지용
            return; // 출력 후 종료
        }

                int x = points[depth].x;
                int y = points[depth].y;

                for (int j = 1; j < 10; j++) {//들어갈 숫자 확인용
                    if(istrue(x,y,j)) {
                        sudoku[x][y] =j;
                        DFS(depth + 1, bw);//출력을 향하여
                        sudoku[x][y]=0;
                    }
                }

    }
    public static boolean istrue(int x,int y,int z){//0자리에 들어갈수있는지 확인(좌표,들어갈숫자
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][y] == z || sudoku[x][i] == z) {
                return false;
            }
        }
        for (int i = (x / 3) * 3; i < (x / 3) * 3 + 3; i++) {
            for (int j = (y / 3) * 3; j < (y / 3) * 3 + 3; j++) {
                if (sudoku[i][j] == z) {
                    return false;
                }
            }
        }
        return true;
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
