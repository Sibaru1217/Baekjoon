import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 수열의 길이 N 입력
        int N = sc.nextInt();
        int[] sequence = new int[N];

        // 2. 수열의 원소 입력
        for (int i = 0; i < N; i++) {
            sequence[i] = sc.nextInt();
        }

        // 3. 등차수열인지 등비수열인지 판별
        // sequence[1] - sequence[0] == sequence[2] - sequence[1] 이면 등차수열
        if ((sequence[1] - sequence[0]) == (sequence[2] - sequence[1])) {
            // 등차수열인 경우: 마지막 항 + 공차
            int diff = sequence[1] - sequence[0];
            System.out.println(sequence[N - 1] + diff);
        } else {
            // 등비수열인 경우: 마지막 항 * 공비
            // 공비(Q) = 두 번째 항 / 첫 번째 항
            int ratio = sequence[1] / sequence[0];
            System.out.println(sequence[N - 1] * ratio);
        }

        sc.close();
    }
}