import java.util.Scanner;

public class EX501 {
    public static boolean is_even(int number) {
//        if(number % 2 == 0){
//            return true;
//        }
//        return false;

        return number % 2 ==0;
    }

    public static String check_type_number(int number){
        if(number > 0 ){
            return "Positive Number";
        }
        if (number < 0) {
            return "Negative Number";
        }
        return "Zero Number";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer");
        int number = scanner.nextInt();

        if (number == 0){
            System.out.println(number + " is " +
                    check_type_number(number));
        }
        else if(is_even(number)){
            System.out.println(number + "is even and" +
                    check_type_number(number));
        }else{
            System.out.println(number + "is Odd and" +
                    check_type_number(number));
        }
    }
}
