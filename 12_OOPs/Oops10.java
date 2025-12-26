// Multiple Inheritance

public class Oops10 {

    public static void main(String[] args) {
        
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
    
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck can fly");
    }

    public void swim() {
        System.out.println("Duck can swim");
    }
}
