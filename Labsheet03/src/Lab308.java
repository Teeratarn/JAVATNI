import java.util.Scanner;

public class Lab308 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number to input : ");
        int count = scanner.nextInt();
        int Max = 0;
        int Min = 999;
        int Even = 0;
        int Odd = 0;
        for (int i = 1;i<=count;i++){
            System.out.print("Enter number " + i +" : ");
            int num = scanner.nextInt();

            if(num>Max){
                Max = num;
            }
            if(num<Min){
                Min = num;
            }
            if(num%2==0){
                Even++;
            }else{
                Odd++;
            }
        }
        System.out.println("Maximun ="+ Max);
        System.out.println("MInimun ="+ Min);
        System.out.println("Even number ="+ Even);
        System.out.println("Odd number ="+ Odd);
    }
}
