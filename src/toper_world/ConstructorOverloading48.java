package toper_world;

public class ConstructorOverloading48 {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    ConstructorOverloading48() {
        System.out.println("constructor");
    }

    ConstructorOverloading48(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorOverloading48 c = new ConstructorOverloading48();
        ConstructorOverloading48 c1=new ConstructorOverloading48("java");
        c.setName("c++");
        System.out.println(c.getName());
        System.out.println(c1.getName());

    }
}
