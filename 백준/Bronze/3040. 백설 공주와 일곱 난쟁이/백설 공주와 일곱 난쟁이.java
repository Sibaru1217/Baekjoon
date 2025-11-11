import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int fake1 = -1, fake2 = -1;

        // 가짜 난쟁이 2명 찾기
        outer:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    fake1 = i;
                    fake2 = j;
                    break outer;
                }
            }
        }

        // 진짜 일곱 난쟁이 키만 모으기
        int[] real = new int[7];
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            if (i == fake1 || i == fake2) continue;
            real[idx++] = arr[i];
        }

        // 오름차순 정렬
        Arrays.sort(real);

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int h : real) {
            sb.append(h).append('\n');
        }
        System.out.print(sb);
    }
}
