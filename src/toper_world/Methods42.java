package toper_world;

public class Methods42 {

    Methods42() {
        System.out.println("constructor is called when you create an object of its class");
    }

    public static void main(String[] args) {
        staticMethod();
        Methods42 m = new Methods42();
        m.nonStaticMethod();
    }

    //static method
    static void staticMethod() {
        System.out.println("static methods can be called without creating the object of the class");
    }

    //non-static method
    void nonStaticMethod() {
        System.out.println("non-static method is called by creating the object of the class");
    }
}
