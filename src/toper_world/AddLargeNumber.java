package toper_world;

import java.math.BigInteger;
import java.util.Scanner;

public class AddLargeNumber {
    public static void main(String[] args) {
        String n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        n1 = scanner.next();
        System.out.println("enter second number");
        n2 = scanner.next();
        BigInteger first = new BigInteger(n1);
        BigInteger second = new BigInteger(n2);
        BigInteger sum;
        sum = first.add(second);
        System.out.println("sum of two numbers: "+sum);
        /*


        BigInteger n1= BigInteger.valueOf(313131313);
        BigInteger n2= BigInteger.valueOf(313131313);
        System.out.println(n1.add(n2));
         */
    }
}
