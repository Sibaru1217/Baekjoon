import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean found = false;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            String agent = br.readLine();

            if (agent.contains("FBI")) {
                sb.append(i).append(" ");
                found = true;
            }
        }

        if (found) {
            System.out.println(sb.toString().trim());
        } else {
            System.out.println("HE GOT AWAY!");
        }
    }
}
