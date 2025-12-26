// Interface - Blueprint of a class

public class Oops9 {

    public static void main(String[] args) {
        
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves(); // public, abstract & without implementation method
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonally in all 4 direction");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonally (by 1 step direction)");
    }
}