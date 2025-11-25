import javax.swing.*;

public class Lab205 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("input minutes:");
        int minutes = Integer.parseInt(input);
        int hour = minutes / 60;
        int hourtomin = minutes % 60;;

        String message = minutes + "minutes is" + hour + "hour" + hourtomin + "minute";

        JOptionPane.showMessageDialog(null,message);

    }
}
