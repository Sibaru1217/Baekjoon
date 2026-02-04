import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String answer = sc.next();

        char[] adrian = {'A', 'B', 'C'};
        char[] bruno = {'B', 'A', 'B', 'C'};
        char[] goran = {'C', 'C', 'A', 'A', 'B', 'B'};

        int aScore = 0, bScore = 0, gScore = 0;

        for (int i = 0; i < N; i++) {
            if (answer.charAt(i) == adrian[i % adrian.length]) {
                aScore++;
            }
            if (answer.charAt(i) == bruno[i % bruno.length]) {
                bScore++;
            }
            if (answer.charAt(i) == goran[i % goran.length]) {
                gScore++;
            }
        }

        int max = Math.max(aScore, Math.max(bScore, gScore));
        System.out.println(max);

        if (aScore == max) System.out.println("Adrian");
        if (bScore == max) System.out.println("Bruno");
        if (gScore == max) System.out.println("Goran");
    }
}
