import javax.swing.JOptionPane;

public class TicketUsed {

    public static String show_movie_list(Ticket[] tickets) {
        String list = "";
        for (Ticket t : tickets) {

            list += t.getTicket_id() + ": " + t.getMovie().toString() + "\n";
        }
        return list;
    }

    public static void main(String[] args) {

        Ticket[] tickets = new Ticket[] {
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 200),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        int startChoice = JOptionPane.showConfirmDialog(null,
                "Do you want to book or use a ticket?",
                "Ticket",
                JOptionPane.YES_NO_OPTION);

        if (startChoice == JOptionPane.YES_OPTION) {

            boolean keepGoing = true;

            while (keepGoing) {

                String message = show_movie_list(tickets) + "\nEnter a ticket id for booking:";
                String idInput = JOptionPane.showInputDialog(null, message, "Input", JOptionPane.QUESTION_MESSAGE);

                if (idInput != null) {

                    Ticket selectedTicket = null;
                    for (Ticket t : tickets) {
                        if (t.getTicket_id().equalsIgnoreCase(idInput)) {
                            selectedTicket = t;
                            break;
                        }
                    }

                    if (selectedTicket != null) {

                        String menuMsg = selectedTicket.getMovie().toString() + "\n\n" +
                                "Press 1 to book a ticket\n" +
                                "Press 2 to use a ticket\n" +
                                "Press 3 to see a ticket status\n\n" +
                                "Enter a menu:";

                        String menuInput = JOptionPane.showInputDialog(null, menuMsg, "Input", JOptionPane.QUESTION_MESSAGE);


                        if (menuInput != null) {
                            String result = "";
                            String separator = "\n-------------------------\n";

                            switch (menuInput) {
                                case "1":
                                    result = selectedTicket.bookTicket() + separator + selectedTicket.toString();
                                    break;
                                case "2":
                                    result = selectedTicket.useTicket() + separator + selectedTicket.toString();
                                    break;
                                case "3":
                                    result = selectedTicket.toString();
                                    break;
                                default:
                                    result = "Invalid menu option";
                            }

                            JOptionPane.showMessageDialog(null, result, "Message", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "Ticket ID not found!");
                    }
                }

                int continueChoice = JOptionPane.showConfirmDialog(null,
                        "Do you want to book or use other tickets?",
                        "Ticket",
                        JOptionPane.YES_NO_OPTION);

                if (continueChoice != JOptionPane.YES_OPTION) {
                    keepGoing = false;
                }
            }
        }
    }
}