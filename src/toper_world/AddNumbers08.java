package toper_world;

import java.util.Scanner;

public class AddNumbers08
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1,n2,sum;
        System.out.println("enter two numbers to calculate their sum: ");
        n1=scanner.nextInt();
        n2=scanner.nextInt();
        sum=n1+n2;
        System.out.println("sum of integers: "+sum);
    }
}
