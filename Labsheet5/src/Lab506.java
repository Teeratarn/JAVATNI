import javax.swing.JOptionPane;

public class Lab506 {

    public boolean is_prime_number(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Lab506 lab = new Lab506();
        int number = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            String input = JOptionPane.showInputDialog(
                    null,
                    "Enter an integer:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (input == null) {
                System.exit(0);
            }

            try {
                number = Integer.parseInt(input);
                if (number > 1) {
                    isValidInput = true;
                }
            } catch (NumberFormatException e) {
                // Loop again if not a valid integer
            }
        }

        if (lab.is_prime_number(number)) {
            JOptionPane.showMessageDialog(
                    null,
                    number + " is Prime number",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    number + " is NOT Prime number",
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}