import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 정렬될 때까지 반복
        while (!isSorted(arr)) {
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    // 출력
                    print(arr);
                }
            }
        }
    }

    // 1 2 3 4 5 인지 확인
    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < 5; i++) {
            if (arr[i] != i + 1) {
                return false;
            }
        }
        return true;
    }

    // 배열 출력
    private static void print(int[] arr) {
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
