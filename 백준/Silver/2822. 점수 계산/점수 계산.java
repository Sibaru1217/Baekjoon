import java.util.*;

public class Main {
    static class Problem {
        int score;
        int index;

        Problem(int score, int index) {
            this.score = score;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Problem> list = new ArrayList<>();

        // 입력
        for (int i = 1; i <= 8; i++) {
            int score = sc.nextInt();
            list.add(new Problem(score, i));
        }

        // 점수 기준 내림차순 정렬
        list.sort((a, b) -> b.score - a.score);

        int sum = 0;
        List<Integer> selected = new ArrayList<>();

        // 상위 5개 선택
        for (int i = 0; i < 5; i++) {
            sum += list.get(i).score;
            selected.add(list.get(i).index);
        }

        // 문제 번호 오름차순 정렬
        Collections.sort(selected);

        // 출력
        System.out.println(sum);
        for (int idx : selected) {
            System.out.print(idx + " ");
        }
    }
}
