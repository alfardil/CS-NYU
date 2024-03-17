import java.util.Random;

public class gradingBook {
    public static void main(String[] args) {
        // 5 students , 4 assigments + 2 exams
        int myClass[][] = new int[5][6];
        // the letter grades of the students
        String myStudentsGrades[] = new String[myClass.length];

        // make some random grades for the class 
        Random random = new Random();
        for (int i = 0; i < myClass.length; i++) {
            for (int j = 0; j < myClass[i].length; j++) {
                myClass[i][j] = random.nextInt(100);
            }
        }
        
        // part b
        for (int i = 0; i < myClass.length; i++) {
            float total = 0;
            float averageGrade = 0;
            float max = 0;
            float min = 100;
            System.out.println("(Assignment (1|2|3|4) | Exam (1|2))");

            for (int j = 0; j < myClass[i].length; j++) {
                // find the max 
                if (myClass[i][j] > max) {
                    max = myClass[i][j];
                }
                // find the min
                if (myClass[i][j] < min) {
                    min = myClass[i][j];
                }
            }
            // look at the assignments
            for (int j = 0; j < myClass[i].length-2; j++){
                // get the addition of all the scores
                total += myClass[i][j];
            }
            total = total / (myClass[i].length-2);
            // assignments are worth 30% 
            averageGrade += total * (.3);

            // look at the exams
            for (int j = 4; j < myClass[i].length; j++) {
                // the exams are worth 35% each
                averageGrade += myClass[i][j] * (.35);
            }

            System.out.println("Average: " + averageGrade);
            // for every student, add their letter grade into a string array
            myStudentsGrades[i] = letterGrade(averageGrade);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println();
        }

        // part c: print what the students got for letter grades
        for (int i = 0; i < myStudentsGrades.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + myStudentsGrades[i]);
        }
    }

    // method to get the letter grade for the students' averages
    public static String letterGrade(float grade) {
        if (grade >= 90) {
            return "A";
        }
        else if (grade >= 80) {
            return "B";
        }
        else if (grade >= 70) {
            return "C";
        }
        else if (grade >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }


}