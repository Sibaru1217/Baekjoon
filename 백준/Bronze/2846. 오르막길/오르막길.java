import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 1) {
            System.out.println(0);
            return;
        }

        int maxDiff = 0;
        int start = arr[0]; // 현재 오르막길의 시작 높이

        for (int i = 1; i < N; i++) {
            if (arr[i] > arr[i - 1]) { // 오르막 계속
                int diff = arr[i] - start;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            } else { // 오르막이 끊김 (같거나 내려감)
                start = arr[i]; // 새로운 오르막 시작점
            }
        }

        System.out.println(maxDiff);
    }
}
