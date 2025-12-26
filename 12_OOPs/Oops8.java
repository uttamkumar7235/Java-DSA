// Abstraction

public class Oops8 {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        
    }
}

// Abstract class
abstract class Animal {
    String color;

    // By default constructor
    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {

    void changeColor() {
        color = "dark brown";
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {

    void changeColor() {
        color = "reddish brown";
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}