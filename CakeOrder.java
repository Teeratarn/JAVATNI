import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Cake
        System.out.println("Birthday Cake's Details: ");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor : ");
        String flavor = scanner.next();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();

        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);
        System.out.println(order1);

        //Cupcake
        System.out.println("\nCup Cake's Details: ");
        System.out.print("Enter a flavor : ");
        String cupFlavor = scanner.next();
        System.out.print("How many pieces: ");
        int piece = scanner.nextInt();

        CupCake order2 = new CupCake(piece, cupFlavor, 65);
        System.out.println(order2);

        // Brownie
        System.out.println("\nBrownie's Details:");
        System.out.print("Enter a flavor : ");
        String CinFlavor = scanner.next();
        System.out.print("How many pieces : ");
        int CinQuantity = scanner.nextInt();

        Brownie order3 = new Brownie(CinFlavor, CinQuantity, 45);

        System.out.print("Do you want it heated? (y/n): ");
        char heatChoice = scanner.next().charAt(0);
        if (heatChoice == 'y' || heatChoice == 'Y') {
            order3.heatUp();
        }

        System.out.println(order3);

        //total
        System.out.println("\nTotal price = " +
                (order1.calculateTotalPrice()
                        + order2.calculateTotalPrice()
                        + order3.calculateTotalPrice()));
    }
}

