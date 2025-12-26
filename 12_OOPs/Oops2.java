// Encapsulation - Binding data and methods together and hiding internal details using access modifiers.

public class Oops2 {
    
    public static void main(String args[]) {
        Pen p1 = new Pen();

        p1.setColor("Blue");
        p1.setTip(5);

        System.out.println(p1.getcolor());
        System.out.println(p1.getTip());
    }
}

class Pen {
    
    private String color;
    private int tip;

    // Setters
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

    // Getters
    String getcolor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }
}
