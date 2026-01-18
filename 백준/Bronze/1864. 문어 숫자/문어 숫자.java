import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문어 문자 -> 숫자 매핑
        Map<Character, Integer> map = new HashMap<>();
        map.put('-', 0);
        map.put('\\', 1);
        map.put('(', 2);
        map.put('@', 3);
        map.put('?', 4);
        map.put('>', 5);
        map.put('&', 6);
        map.put('%', 7);
        map.put('/', -1);

        while (true) {
            String input = br.readLine();
            if (input.equals("#")) break;

            long result = 0;
            int len = input.length();

            for (int i = 0; i < len; i++) {
                char c = input.charAt(i);
                int value = map.get(c);
                result += value * Math.pow(8, len - 1 - i);
            }

            System.out.println(result);
        }
    }
}
