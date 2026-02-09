import java.util.Scanner;

public class CakeOrder2 {

    public static String selectFlavor(Scanner sc) {
        String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Lemon", "Red Velvet"};

        while (true) {
            System.out.println("---------------------------");
            for (int i = 0; i < flavors.length; i++) {
                System.out.println("Press " + (i + 1) + " for " + flavors[i]);
            }
            System.out.print("Enter a flavor number: ");

            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                sc.nextLine();

                if (choice >= 1 && choice <= flavors.length) {
                    return flavors[choice - 1];
                }
            } else {
                sc.nextLine();
            }

            System.out.println("Invalid flavor! Please try again.\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("###############################");
        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.println("Press 3 to order Brownie");
        System.out.println("###############################");
        System.out.print("Enter an option: ");

        // Validate main menu input
        if (!sc.hasNextInt()) {
            System.out.println("Wrong option!! Try again!!");
            return;
        }

        int option = sc.nextInt();
        sc.nextLine();

        if (option == 1) {
            String flavor = selectFlavor(sc);

            System.out.print("Enter a message: ");
            String msg = sc.nextLine();

            System.out.print("How many pounds: ");
            double pound = sc.nextDouble();

            BirthdayCake order = new BirthdayCake(msg, pound, flavor, 350.0);
            System.out.println("\n" + order.toString());

        } else if (option == 2) {
            String flavor = selectFlavor(sc);

            System.out.print("How many pieces: ");
            int pieces = sc.nextInt();

            CupCake order = new CupCake(pieces, flavor, 70.0);
            System.out.println("\n" + order.toString());

        } else if (option == 3) {
            String flavor = selectFlavor(sc);

            System.out.print("How many pieces: ");
            int qty = sc.nextInt();

            Brownie order = new Brownie(flavor, 45.0, qty);

            System.out.print("Do you want it heated? (y/n): ");
            char heat = sc.next().charAt(0);
            if (heat == 'y' || heat == 'Y') {
                order.heatUp();
            }

            System.out.println("\n" + order.toString());

        } else {
            System.out.println("Wrong option!! Try again!!");
        }
    }
}

