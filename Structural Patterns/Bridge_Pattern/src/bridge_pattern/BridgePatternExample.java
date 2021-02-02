package bridge_pattern;

public class BridgePatternExample {

    public static void main(String[] args) {
        Shape redSquare = new Square(10, new RedSquare());
        Shape greenSquare = new Square(100, new GreenSquare());
        
        redSquare.draw();
        greenSquare.draw();
    }
    
}
