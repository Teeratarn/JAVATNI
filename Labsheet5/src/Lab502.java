import javax.swing.JOptionPane;

public class Lab502 {

    public String find_grade(int score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public int cal_score(int midterm, int finalScore) {
        return midterm + finalScore;
    }

    public int input_score(String message, int limit_score) {
        int score = -1;
        String Message = message;
        boolean isValid = false;

        while (!isValid) {
            String input = JOptionPane.showInputDialog(
                    null,
                    Message,
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            if (input == null) {
                System.exit(0);
            }

            try {
                score = Integer.parseInt(input);
                if (score >= 0 && score <= limit_score) {
                    isValid = true;
                } else {
                    Message = "Score must be in range between 0 and " + limit_score + "\n" + message;
                }
            } catch (NumberFormatException e) {
                Message = "Score must be in range between 0 and " + limit_score + "\n" + message;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Lab502 lab = new Lab502();
        int choice;

        do {
            choice = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to check your score?",
                    "Check score",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice == JOptionPane.YES_OPTION) {
                int midterm = lab.input_score("Enter midterm-score:", 45);
                int finalScore = lab.input_score("Enter final-score:", 55);

                int totalScore = lab.cal_score(midterm, finalScore);
                String grade = lab.find_grade(totalScore);

                JOptionPane.showMessageDialog(
                        null,
                        "Total Score : " + totalScore + "\nGrade : " + grade,
                        "Result",
                        JOptionPane.INFORMATION_MESSAGE
                );

            } else if (choice == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(
                        null,
                        "END PROGRAM!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE
                );
                break;
            } else {
                break;
            }
        } while (true);
    }
}