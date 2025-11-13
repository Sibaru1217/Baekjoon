import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int prize;
            if (a == b && b == c) {                 // 3개 같음
                prize = 10000 + a * 1000;
            } else if (a == b || a == c) {          // a와 같은 값 2개
                prize = 1000 + a * 100;
            } else if (b == c) {                    // b와 c가 같음
                prize = 1000 + b * 100;
            } else {                                 // 모두 다름
                int max = Math.max(a, Math.max(b, c));
                prize = max * 100;
            }

            if (prize > answer) answer = prize;
        }

        System.out.println(answer);
    }
}
