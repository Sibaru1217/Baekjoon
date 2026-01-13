import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = br.readLine();

            // 종료 조건
            if (input.equals("0")) {
                break;
            }

            String reversed = new StringBuilder(input).reverse().toString();

            if (input.equals(reversed)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
