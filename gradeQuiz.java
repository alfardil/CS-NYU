import java.util.Scanner;

public class gradeQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char answerKey[] = {'A', 'A', 'C', 'D', 'D', 'B', 'C', 'A', 'D', 'A'};

        System.out.print("How many students are there? ");
        int numStudents = scanner.nextInt();

        char answers[][] = new char[numStudents][answerKey.length];

        for (int i = 0; i < answers.length; i++) {
            System.out.println("Student " + (i+1));
            for (int j = 0; j < answers[i].length; j++) {
                System.out.print("(Question " + (j+1) + ") ");
                answers[i][j] = scanner.next().toUpperCase().charAt(0); 
            }
        }

        int result = 0; 

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == answerKey[j]) {
                    result += 1;
                }
            }
            System.out.println("Student " + (i+1) + " receieved " + result + " correct. " + (result*10) + "% achieved.");
        }


        scanner.close();
    }
}
