import javax.swing.*;

public class Lab302 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        String heightStr = JOptionPane.showInputDialog("Enter your height(cm.)");
        double height = Double.parseDouble(heightStr);
        double stdWeight = 0;

        int isMale = JOptionPane.showConfirmDialog(null,
                "Are you biological gender is Male?",
                "Gender",
                JOptionPane.YES_NO_OPTION);

        if(isMale==JOptionPane.YES_OPTION){
            stdWeight = height - 100;
            JOptionPane.showMessageDialog(null,
                    "Hello,Mr." + name + "\nif your height is " + height + " cm.\n" +
                    "Your weight should be " + stdWeight +"kg.");
        }else {

            int isFemale = JOptionPane.showConfirmDialog(null,
                    "Are you biological gender is Female?",
                    "Gender",
                    JOptionPane.YES_NO_OPTION);

            if (isFemale == JOptionPane.YES_OPTION) {
                stdWeight = height - 110;
                JOptionPane.showMessageDialog(null,
                        "Hello,Mr." + name + "\nif your height is " + height + " cm.\n" +
                                "Your weight should be " + stdWeight +"kg");
            } else {

                JOptionPane.showMessageDialog(null,
                        "You can use BMI to measure your weight and height.");
            }
        }
    }
}
