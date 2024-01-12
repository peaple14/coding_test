import java.math.BigInteger;
import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[] args) throws IOException {
        //BigInteger는 무제한
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String st1 = st.nextToken();
        String st2 = st.nextToken();
        BigInteger st1_binary = new BigInteger(st1, 2);
        BigInteger st2_binary = new BigInteger(st2, 2);
        BigInteger sum = st1_binary.add(st2_binary);
        String sum_binary = sum.toString(2);
        System.out.println(sum_binary);

    }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//
//        st = new StringTokenizer(br.readLine(), " ");
//        String[] st1 = st.nextToken().split("");
//        String[] st2 = st.nextToken().split("");
//        List<String> list1 = Arrays.asList(st1);
//        List<String> list2 = Arrays.asList(st2);
//        Collections.reverse(list1);
//        Collections.reverse(list2);
//        String[] rArr1 = list1.toArray(st1);
//        String[] rArr2 = list2.toArray(st2);
//        int[] result = new int[Math.max(rArr1.length, rArr2.length)+1];
//
//        for (int i = 0; i < rArr1.length; i++) {
//            result[i] = Integer.parseInt(rArr1[i]);
//        }
//        for (int i = 0; i < rArr2.length; i++) {
//            result[i] = result[i] + Integer.parseInt(rArr2[i]);
//            if (result[i] >= 2) {
//                result[i] = result[i] - 2;
//                result[i + 1]++;
//            }
//        }
//        int ln = (result[result.length - 1] == 1) ? result.length-1 : result.length - 2;
//        for (int i = ln; i >=0; i--) {
//            System.out.print(result[i]);
//        }
//            br.close();
//        }
    }
