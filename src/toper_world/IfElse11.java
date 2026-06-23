package toper_world;

import java.util.Scanner;

public class IfElse11 {
    public static void main(String[] args) {
        int marksObtained, passingMarks;
        passingMarks = 40;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the marks scored by you");
        marksObtained = scanner.nextInt();
        if (marksObtained >= passingMarks) {
            System.out.println("you passed the exam");
        }else {
            System.out.println("unfortunately you failed!");
        }
    }
}
