import javax.swing.JOptionPane;

public class TicketBooking {

    public static String select_showtime(Movie movie) {
        String message = movie.toString() + "\n" +
                "Press 1 to select show time = 13:00\n" +
                "Press 2 to select show time = 14:30\n" +
                "Press 3 to select show time = 15:00\n" +
                "Enter a number:";

        String input = JOptionPane.showInputDialog(null, message, "Input", JOptionPane.QUESTION_MESSAGE);

        if (input == null) return "Error time";

        switch (input) {
            case "1": return "13:00";
            case "2": return "14:30";
            case "3": return "15:00";
            default: return "Error time";
        }
    }

    public static String select_seat_number() {
        String row = JOptionPane.showInputDialog(null, "Select seat row [A-G]:", "Input", JOptionPane.QUESTION_MESSAGE);
        String number = JOptionPane.showInputDialog(null, "Select seat number [1-12]:", "Input", JOptionPane.QUESTION_MESSAGE);

        if (row == null || number == null) return "Unknown";

        return row.toUpperCase() + number;
    }

    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 120, "PG-13");
        String show_time = select_showtime(movie);
        String seat_number = select_seat_number();

        Ticket ticket = new Ticket("T001", movie, show_time, seat_number, 240.0);

        int choice = JOptionPane.showConfirmDialog(null,
                "Do you want to book a " + movie.getTitle() + " ticket?",
                "Book Ticket",
                JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            String bookingResult = ticket.bookTicket();
            JOptionPane.showMessageDialog(null, bookingResult);
        }

        JOptionPane.showMessageDialog(null, ticket.toString());
    }
}

