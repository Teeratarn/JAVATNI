import javax.swing.*;

public class Lab307 {
    public static void main(String[] args) {
        int total = 0;

        while (true) {

            String input = JOptionPane.showInputDialog(null, "Input price (press 0 to stop)");

            if (input == null) break;

            int price = Integer.parseInt(input);

            if (price == 0) break;

            while (price < 0) {
                input = JOptionPane.showInputDialog(
                        null,
                        "Invalid price!\nInput price (press 0 to stop)",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE
                );

                if (input == null) return;

                price = Integer.parseInt(input);

                if (price == 0) {
                    JOptionPane.showMessageDialog(null, "Total price is " + total + " baht.");
                    return;
                }
            }
            total += price;
        }

        JOptionPane.showMessageDialog(null, "Total price is " + total + " baht.");
    }
}
