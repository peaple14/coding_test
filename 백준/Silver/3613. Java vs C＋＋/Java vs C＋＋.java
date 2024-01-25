    import java.time.LocalDate;
    import java.util.*;
    import java.io.*;

    public class Main {
        


        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            char[] a = br.readLine().toCharArray();//65~90 , 97~122   32차이남.  _는 95
            int check = 1; //1이면 자바, 2면c++
            //aazz_zzA  -> Error떠야함
            int jbackup = 0;//_가 나왔는데 대문자나올시
            int cbackup = 0;//대문자가 나왔는데 대문자나올시
            if (a[a.length -1] <= 90) {
                cbackup = 1;
            }

            if (a[0] == '_' || a[a.length - 1] == '_' || a[0] <= 90) {//제일처음과 마지막 _일때 혹은 맨처음 대문자일때
                check = 0;
            }

            if (check != 0) {
                for (int i=0;i<a.length-1;i++) {
                    if (a[i] == 95) {
                        jbackup = 1; //_나옴
                        if (a[i + 1] == 95  || a[i+1] <=90) {
                            check = 0;
                            break;
                        }
                        check = 2;
                    }
                    if (a[i] <= 90) {
                        cbackup =1;//대문자나옴
                    }
                }
            }


            if (cbackup == 1 && jbackup == 1) {
                check = 0;
            }

            if (a.length == 1 && a[0] <= 90) {
                check = 1;
            }

            if (check == 0 ) {
                bw.write("Error!");
            }

            if (check == 2) {
                for (int i = 0; i < a.length; i++) {
                    if (a[i] == '_') {
                        a[i] = '0';

                        a[i + 1] = (char) (a[i + 1] - 32);
                    } else {
                        bw.write(a[i]);
                    }
                }
            } else if (check == 1) {
                for (char c : a) {
                    if (c <= 90) {
                        bw.write("_" + (char) (c + 32));
                    } else {
                        bw.write(c);
                    }
                }
            }




            bw.write("\n");



            br.close();
            bw.flush();
            bw.close();
        }
    }


