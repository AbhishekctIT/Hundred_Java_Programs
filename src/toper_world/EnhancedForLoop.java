package toper_world;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] primes = {2, 5, 7, 9, 11, 13};
        for (int prime : primes) {
            System.out.println(prime);
        }
        System.out.println("--------------");
        String[] fruits = {"apple", "mango", "orange"};
        for (String f:fruits){
            System.out.println(f);
        }
    }
}
