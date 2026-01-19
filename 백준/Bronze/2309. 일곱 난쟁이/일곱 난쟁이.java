import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] height = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            height[i] = sc.nextInt();
            sum += height[i];
        }

        int fake1 = -1, fake2 = -1;

        // 두 명을 골라서 제외
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - height[i] - height[j] == 100) {
                    fake1 = i;
                    fake2 = j;
                    break;
                }
            }
            if (fake1 != -1) break;
        }

        // 진짜 난쟁이만 배열에 담기
        int[] result = new int[7];
        int idx = 0;
        for (int i = 0; i < 9; i++) {
            if (i != fake1 && i != fake2) {
                result[idx++] = height[i];
            }
        }

        // 오름차순 정렬
        Arrays.sort(result);

        // 출력
        for (int h : result) {
            System.out.println(h);
        }
    }
}
