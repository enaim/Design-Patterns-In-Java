package bridge_pattern;

public class RedSquare implements DrawAPI{

    @Override
    public void drawSquare(int x) {
        System.out.println("Drawing Square [ Colod: Red, sideLength = " + x + " ]");
    }
    
}