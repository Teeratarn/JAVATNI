import java.util.Scanner;

public class EX604 {
    public static Scanner scanner = new Scanner(System.in);

    public static int input_lenght(){
        System.out.print("How many number to input : ");
        int lenght = scanner.nextInt();
        while(lenght < 1 ){
            System.out.print("How many number to input : ");
            lenght = scanner.nextInt();
        }
        return lenght;
    }
    public static int[] input_array(int lenght){
        int[] number = new int[lenght];
        for(int i=0;i<lenght;i++){
            System.out.print("Enter number : ");
            number[i] = scanner.nextInt();
        }
        return number;
    }
    public static int count_even(int[] numbers){
        int count = 0;
        for(int num : numbers){
            if(num % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] numbers = input_array(input_lenght());

        System.out.print("There are" + count_even(numbers) +
                "number(s) in array = ");
        for(int num : numbers){
            if(num % 2 == 0)
            System.out.print(num + " ");
        }
    }
}
