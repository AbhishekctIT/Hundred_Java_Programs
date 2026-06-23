package toper_world;

public class TestThrow50 {
    public static void main(String[] args) {
       try {
           validate(10);
       }catch (ArithmeticException e){
           System.out.println("exception: "+e.getMessage());
       }
        System.out.println("rest of the code");
    }

    static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("age not valid");
        } else {
            System.out.println("you can vote");
        }
    }
}
