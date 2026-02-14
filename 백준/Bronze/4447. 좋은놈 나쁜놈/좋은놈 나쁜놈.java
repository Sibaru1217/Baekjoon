import java.util.Scanner;

public class Main { // 클래스 이름을 Main으로 설정해야 컴파일 에러가 나지 않습니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫 번째 줄에서 테스트 케이스 개수를 읽습니다.
        if (!sc.hasNextInt()) return;
        int n = Integer.parseInt(sc.nextLine()); 

        for (int i = 0; i < n; i++) {
            if (!sc.hasNextLine()) break;
            
            String name = sc.nextLine();
            int gCount = 0;
            int bCount = 0;

            // 문자열을 하나씩 검사 (대소문자 구분 없이)
            for (int j = 0; j < name.length(); j++) {
                char ch = Character.toLowerCase(name.charAt(j));
                if (ch == 'g') {
                    gCount++;
                } else if (ch == 'b') {
                    bCount++;
                }
            }

            // 결과 판별
            String status;
            if (gCount > bCount) {
                status = "is GOOD";
            } else if (bCount > gCount) {
                status = "is A BADDY";
            } else {
                status = "is NEUTRAL";
            }

            // 최종 출력
            System.out.println(name + " " + status);
        }
        
        sc.close();
    }
}