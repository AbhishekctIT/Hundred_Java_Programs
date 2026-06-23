package toper_world;

import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first string: ");
        str1 = scanner.next();
        System.out.println("enter the second string: ");
        str2 = scanner.next();
        if (str1.compareTo(str2) > 0) {
            System.out.println("str1 is greater than str2");
        } else if (str1.compareTo(str2) < 0){
            System.out.println("str1 is lesser than str2");
        }else {
            System.out.println("both strings are equal");
        }
    }
}
