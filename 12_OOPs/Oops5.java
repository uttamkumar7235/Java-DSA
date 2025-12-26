// Multi Level Inheritance

public class Oops5 {

    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breath() {
        System.out.println("breaths");
    }
}

// Derived class
class Mammals extends Animal {
    int legs;
}

// Derived class 
class Dog extends Mammals {
    String breed;
}