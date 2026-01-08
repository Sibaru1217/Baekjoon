import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();

            // 종료 조건
            if (line.equals("#")) {
                break;
            }

            int count = 0;
            line = line.toLowerCase(); // 대소문자 통일

            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
