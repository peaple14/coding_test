import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        String st;
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < count; i++) {
            st=br.readLine();
            if (map.containsKey(st)) {
                map.put(st, map.get(st) + 1);
            } else {
                map.put(st, 1);
            }
        }
        List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((o1, o2) -> {
            return o2.getValue().compareTo(o1.getValue()); // 내림차순
        });

        ArrayList<String> a = new ArrayList<>();
        a.add(list.get(0).getKey());

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1).getValue() != list.get(i).getValue()) {
                break;
            } else {
                a.add(list.get(i).getKey());
            }
        }
        Collections.sort(a);
        bw.write(a.get(0));
        br.close();
        bw.flush();
        bw.close();
    }
}


