public class Ex601 {
    public static void main(String[] args) {
        int[] number = {38, 7, 91, 54, 12, 83, 26};
        System.out.println("Array Lenght = " + number.length);
        System.out.println("First data = " + number[0]);
        System.out.println("Last data = " + number[number.length-1]);
        System.out.println("List of number in array = ");
        for(int num : number){
            System.out.print(num + " ");
        }
    }
}
