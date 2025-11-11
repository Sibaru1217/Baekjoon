import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] P = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(P); // 오름차순 정렬
        
        int sum = 0;       // 각 사람까지의 누적 시간
        int answer = 0;    // 누적 시간들의 합
        
        for (int i = 0; i < N; i++) {
            sum += P[i];   // i번째 사람까지 걸리는 시간
            answer += sum; // 그 시간을 전체 합에 더함
        }
        
        System.out.println(answer);
    }
}
