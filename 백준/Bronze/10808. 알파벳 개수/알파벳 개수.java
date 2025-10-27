import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] count = new int[26]; // a~z 26개 알파벳 카운트용 배열

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            count[c - 'a']++; // 'a'를 0으로 맞춰 인덱스 계산
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
