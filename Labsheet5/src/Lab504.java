import java.util.Scanner;

public class Lab504 {

    public boolean check_password(String pass) {
        return pass.length() > 8;
    }

    public boolean check_password(String pass, String confirm_pass) {
        return pass.equals(confirm_pass);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lab504 lab = new Lab504();
        String password;
        String confirmPassword;

        System.out.print("Create password: ");
        password = scan.nextLine();

        while (!lab.check_password(password)) {
            System.out.print("Invalid Password! Create password: ");
            password = scan.nextLine();
        }

        System.out.println();
        System.out.print("Enter confirm password: ");
        confirmPassword = scan.nextLine();

        while (!lab.check_password(password, confirmPassword)) {
            System.out.print("Password do not match! Enter confirm password: ");
            confirmPassword = scan.nextLine();
        }

        System.out.println();
        System.out.println("Password set successfully!!");
    }
}