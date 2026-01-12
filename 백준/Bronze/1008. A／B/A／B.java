import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 두 정수 A와 B를 double 타입으로 입력받음
        // (나눗셈 결과의 정밀도를 위해 double 사용)
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        // 결과 출력
        System.out.println(a / b);
        
        sc.close();
    }
}