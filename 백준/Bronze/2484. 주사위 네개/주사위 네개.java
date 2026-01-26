import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int maxPrize = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] count = new int[7];

            for (int j = 0; j < 4; j++) {
                int dice = Integer.parseInt(st.nextToken());
                count[dice]++;
            }

            int prize = 0;

            // 같은 눈 개수 기준 판단
            boolean four = false;
            boolean three = false;
            List<Integer> pairs = new ArrayList<>();

            int maxEye = 0;

            for (int eye = 1; eye <= 6; eye++) {
                if (count[eye] == 4) {
                    prize = 50000 + eye * 5000;
                    four = true;
                    break;
                }
                if (count[eye] == 3) {
                    prize = 10000 + eye * 1000;
                    three = true;
                }
                if (count[eye] == 2) {
                    pairs.add(eye);
                }
                if (count[eye] == 1) {
                    maxEye = Math.max(maxEye, eye);
                }
            }

            if (!four) {
                if (three) {
                    // 이미 계산됨
                } else if (pairs.size() == 2) {
                    prize = 2000 + pairs.get(0) * 500 + pairs.get(1) * 500;
                } else if (pairs.size() == 1) {
                    prize = 1000 + pairs.get(0) * 100;
                } else {
                    prize = maxEye * 100;
                }
            }

            maxPrize = Math.max(maxPrize, prize);
        }

        System.out.println(maxPrize);
    }
}
