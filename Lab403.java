import javax.swing.*;
public class Lab403 {
    public static void main(String[] args) {
        final String USERNAME = "admin", PASSWORD = "Admin1234";

        String user = JOptionPane.showInputDialog("Enter username:");
        String password = JOptionPane.showInputDialog("Enter password:");

        boolean userPass = user.equalsIgnoreCase(USERNAME);
        boolean passwordPass = password.equals(PASSWORD);

        while (true) {
            if (userPass && passwordPass) {
                JOptionPane.showMessageDialog(null, "Login Success!!");
                break;
            }
            JOptionPane.showMessageDialog(null,"Login Fail...",
                    "Incorrect username or password",JOptionPane.WARNING_MESSAGE);break;
        }
    }
}
