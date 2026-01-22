import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line.equals("#")) break; // 입력 종료

            char target = line.charAt(0);           // 찾을 알파벳
            String sentence = line.substring(2);    // 문장 부분

            int count = 0;
            char lowerTarget = Character.toLowerCase(target);

            for (int i = 0; i < sentence.length(); i++) {
                char c = Character.toLowerCase(sentence.charAt(i));
                if (c == lowerTarget) {
                    count++;
                }
            }

            System.out.println(target + " " + count);
        }
    }
}
