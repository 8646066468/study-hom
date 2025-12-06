import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 사용자로부터 입력을 받기 위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 연도 N을 정수로 입력받습니다.
        int N = sc.nextInt();
        
        // 윤년 판별 조건: (4의 배수 AND 100의 배수가 아님) OR (400의 배수)
        
        // 1. 4의 배수 조건 (N % 4 == 0)
        boolean cond1 = (N % 4 == 0);
        
        // 2. 100의 배수가 아닐 조건 (N % 100 != 0)
        boolean cond2 = (N % 100 != 0);
        
        // 3. 400의 배수 조건 (N % 400 == 0)
        boolean cond3 = (N % 400 == 0);
        
        // 최종 윤년 조건 결합
        boolean isLeapYear = (cond1 && cond2) || cond3;
        
        // 결과 출력
        if (isLeapYear) {
            System.out.println(1); // 윤년이면 1 출력
        } else {
            System.out.println(0); // 윤년이 아니면 0 출력
        }
        
        // Scanner 객체 닫기
        sc.close();
    }
}