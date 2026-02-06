import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int a = N / 2;
        int b = N - a;

        System.out.println((a + 1) * (b + 1));
    }
}
