import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 100원짜리 동전 개수
        int M = sc.nextInt(); // 초코바 가격

        if (100 * N >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}