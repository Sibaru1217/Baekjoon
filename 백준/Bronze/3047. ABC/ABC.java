import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }

        String order = sc.next();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            char c = order.charAt(i);
            if (c == 'A') sb.append(arr[0]);
            else if (c == 'B') sb.append(arr[1]);
            else sb.append(arr[2]);

            if (i < 2) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
