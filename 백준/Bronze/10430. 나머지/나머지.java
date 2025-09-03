import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int first = (A + B) % C;
        int second = ((A % C) + (B % C)) % C;
        int third = (A * B) % C;
        int fourth = ((A % C) * (B % C)) % C;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);


    }
}