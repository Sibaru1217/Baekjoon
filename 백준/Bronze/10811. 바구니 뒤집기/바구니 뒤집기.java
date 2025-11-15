import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;   // 처음 상태: 1,2,3,...,N
        }
        
        for (int m = 0; m < M; m++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            // i~j 구간 뒤집기 (1-based → 0-based)
            int left = i - 1;
            int right = j - 1;
            while (left < right) {
                int tmp = basket[left];
                basket[left] = basket[right];
                basket[right] = tmp;
                left++;
                right--;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(basket[i]).append(' ');
        }
        System.out.println(sb);
    }
}
