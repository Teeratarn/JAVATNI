import javax.swing.*;

public class EX502 {
    public static int input_score(String message,int limit_score){
        int score = Integer.parseInt(JOptionPane.showInputDialog(message));
        while(score < 0 || score > limit_score){
            score = Integer.parseInt(JOptionPane.showInputDialog(
                    "Score must be in range between 0 and" + limit_score +
                            "\n" + message));
        }
        return score;
    }
    public static int cal_score(int midterm,int Final){
        return midterm + Final;
    }
    public static boolean is_pass(int score){
        if(score >= 50){
            return true;
        }return false;
    }

    public static void main(String[] args) {
        int midterm = input_score("Enter midterm score:",35);
        int Final = input_score("Enter Final score:",65);


        if(is_pass(cal_score(midterm,Final))){
            JOptionPane.showMessageDialog(null,
                    "Your score is" + cal_score(midterm,Final) +
                    "\nYour result is Pass");
        }else {
            JOptionPane.showMessageDialog(null,
                    "Your score is" + cal_score(midterm,Final) +
                            "\nYour result is Fail");
        }
    }
}
