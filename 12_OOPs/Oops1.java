public class Oops1 {
    
    public static void main(String[] args) {

        Pen p1 = new Pen(); // creating a Pen object called p1

        p1.setColor("blue");
        System.out.println(p1.color);

        // p1.setTip(5);
        p1.tip = 5;
        System.out.println(p1.tip);
    }
}

// blueprint
class Pen {
    
    // properties
    String color;
    int tip;

    // Constructor
    Pen(){};

    // methods
    void setColor (String newColor) {
        color = newColor;
    }

    void setTip (int newTip) {
        tip = newTip;
    }
}