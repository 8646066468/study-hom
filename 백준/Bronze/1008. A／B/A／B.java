import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a=input.nextInt();
        int b=input.nextInt();
        double result = (double)a/b;
        System.out.println(result);
    }
}