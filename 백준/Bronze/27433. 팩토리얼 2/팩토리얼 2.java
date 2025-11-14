import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long result = 1;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}