import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int ball = 1; // 처음에 공은 1번 컵

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            // 공이 있는 컵이 교환 대상이면 위치 변경
            if (ball == X) {
                ball = Y;
            } else if (ball == Y) {
                ball = X;
            }
        }

        System.out.println(ball);
    }
}
