import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] a = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) a[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(a);
        int best = 0;

        for (int i = 0; i < N - 2; i++) {
            int left = i + 1, right = N - 1;
            while (left < right) {
                int sum = a[i] + a[left] + a[right];
                if (sum == M) { // 최적값
                    System.out.println(M);
                    return;
                }
                if (sum < M) {
                    if (sum > best) best = sum;
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println(best);
    }
}
