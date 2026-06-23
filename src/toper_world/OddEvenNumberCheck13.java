package toper_world;

import java.util.Scanner;

public class OddEvenNumberCheck13 {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number to check even or odd");
        number=scanner.nextInt();
        if (number%2==0)
            System.out.println("you entered an even number");
        else
            System.out.println("you entered an odd number");
    }
}
