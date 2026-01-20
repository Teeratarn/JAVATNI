import javax.swing.JOptionPane;

public class BookInventory {
    public static void main(String[] args) {

        Book[] books = new Book[3];


        for (int i = 0; i < books.length; i++) {

            String titleInput = JOptionPane.showInputDialog(null, "Enter book title:");


            String totalInput = JOptionPane.showInputDialog(null, "Enter the total number:");


            int total = 0;
            try {
                total = Integer.parseInt(totalInput);
            } catch (NumberFormatException e) {

                total = 0;
            }


            books[i] = new Book(titleInput, total);
        }


        System.out.println("---------------- Results ----------------");
        for (int i = 0; i < books.length; i++) {

            System.out.println(books[i].getTitle() + " has " +
                    books[i].getTotalBook() + " books, can borrow " +
                    books[i].getAvailableBook() + " books.");
        }
    }
}
