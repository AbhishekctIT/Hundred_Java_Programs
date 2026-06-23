package toper_world;

public class MultipleClasses46 {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.computerMethod();
        Laptop l=new Laptop();
        l.laptopMethod();
    }
}

class Computer{
    Computer(){
        System.out.println("constructor of computer");
    }
    void computerMethod(){
        System.out.println("computer method");
    }
}

class Laptop{
    Laptop(){
        System.out.println("constructor of laptop");
    }
    void laptopMethod(){
        System.out.println("laptop method");
    }
}
