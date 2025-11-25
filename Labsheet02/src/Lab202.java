import java.util.Scanner;

public class Lab202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter number 2 : ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        double Div = (double)num1 / num2;
        int Mod = num1 % num2;

        System.out.println();
        System.out.println("Summation = "+sum);
        System.out.println("Subtraction = "+sub);
        System.out.println("Multiplication = "+mul);
        System.out.println("Division = "+Div);
        System.out.println("Modulus = "+Mod);
    }
}
