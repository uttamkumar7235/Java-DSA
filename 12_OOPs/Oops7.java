// Polymorphism

public class Oops7 { 

    public static void main(String[] args) {

        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer {
    
    // Runtime Polymorphism (Method Overriding)
    void eat() {
        System.out.println("eats only grass");
    }
}