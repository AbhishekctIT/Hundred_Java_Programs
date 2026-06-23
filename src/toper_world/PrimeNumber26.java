package toper_world;

public class PrimeNumber26 {
    public static void main(String[] args) {
            int num=11;
           boolean res= isPrime(num);
        System.out.println(res);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
