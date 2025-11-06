import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());  // 테스트 케이스 개수

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < P; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());      // 테스트 케이스 번호
            double D = Double.parseDouble(st.nextToken()); // 철로 길이
            double A = Double.parseDouble(st.nextToken()); // 기차 A 속도
            double B = Double.parseDouble(st.nextToken()); // 기차 B 속도
            double F = Double.parseDouble(st.nextToken()); // 파리 속도

            double time = D / (A + B);     // 두 기차가 만날 때까지 시간
            double dist = F * time;        // 파리가 이동한 거리

            // 오차 1e-2까지 허용이라 그냥 출력해도 되지만, 깔끔하게 소수 6자리까지 출력
            sb.append(N).append(" ")
              .append(String.format("%.6f", dist))
              .append('\n');
        }

        System.out.print(sb);
    }
}
