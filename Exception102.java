import javax.swing.*;

public class Exception102 {
    public static void main(String[] args) {

        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                number = Integer.parseInt(
                        JOptionPane.showInputDialog("Input an integer : ")
                );
                validInput = true; // ถ้าไม่ error ให้ออกจากลูป
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(null,
                        "Error: Input number no String",
                        "Error Message",
                        JOptionPane.WARNING_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null,
                "You inputted number = " + number);
    }
}
