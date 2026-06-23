package toper_world;

import java.util.Scanner;

public class NestedIfElse12 {
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        passingMarks = 40;
        char grade = ' ';
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks");
        marksObtained = scanner.nextInt();
        if (marksObtained >= passingMarks) {
            if (marksObtained >= 90)
                grade = 'A';
            else if (marksObtained >= 75)
                grade = 'B';
            else if (marksObtained >= 60)
                grade = 'C';
            else
                grade = 'D';
            System.out.println("you passed the exam with grade " + grade);

        } else {
            grade = 'F';
            System.out.println("you failed the exam with grade " + grade);
        }
    }
}
