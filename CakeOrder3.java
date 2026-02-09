import javax.swing.JOptionPane;

public class CakeOrder3 {
    public static void main(String[] args) {
        String poundStr = JOptionPane.showInputDialog(null, "How many pounds do you want?", "Input", JOptionPane.QUESTION_MESSAGE);
        if (poundStr == null) return;
        double pound = Double.parseDouble(poundStr);
        String flavor = JOptionPane.showInputDialog(null, "Enter a flavor birthday cake:", "Input", JOptionPane.QUESTION_MESSAGE);
        if (flavor == null) return;
        String message = JOptionPane.showInputDialog(null, "Enter a message on cake:", "Input", JOptionPane.QUESTION_MESSAGE);
        if (message == null) return;
        BirthdayCake order = new BirthdayCake(message, pound, flavor, 400.0);
        while (true) {
            String orderDetails = order.toString() + "\n\nConfirm this order?";

            int choice = JOptionPane.showConfirmDialog(null,
                    orderDetails,
                    "Select an Option",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if (choice == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,
                        order.toString(),
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                break;

            } else if (choice == JOptionPane.NO_OPTION || choice == JOptionPane.CANCEL_OPTION) {
                String newMessage = JOptionPane.showInputDialog(null,
                        "Enter a new message for changing:",
                        "Input",
                        JOptionPane.QUESTION_MESSAGE);

                if (newMessage != null && !newMessage.trim().isEmpty()) {
                    order.changMessage(newMessage);
                }
                // The loop continues here, showing the confirmation dialog again with the new message
            } else {
                // User closed the window (X button)
                break;
            }
        }
    }
}
