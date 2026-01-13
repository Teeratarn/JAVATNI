import java.util.Scanner;

public class StudentMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] st = new Student[10];

        for (int i=0; i<st.length; i++){
            st[i] = new Student();

            System.out.print("Enter student name: ");
            st[i].name = scanner.next();

            System.out.print("Enter student id: ");
            st[i].id = scanner.next();

            System.out.print("Enter homework score: ");
            st[i].doHomework(scanner.nextInt());

            System.out.print("Enter exam score: ");
            st[i].takeExam(scanner.nextInt());
        }

        for (Student s : st){
            System.out.println();
            s.showStatus();
        }
    }
}
