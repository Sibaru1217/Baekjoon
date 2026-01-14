import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 앞뒤 공백 제거
        input = input.trim();

        // 빈 문자열인 경우 (공백만 입력된 경우 대비)
        if (input.isEmpty()) {
            System.out.println(0);
            return;
        }

        // 공백 기준 분리
        String[] words = input.split(" ");
        System.out.println(words.length);
    }
}
