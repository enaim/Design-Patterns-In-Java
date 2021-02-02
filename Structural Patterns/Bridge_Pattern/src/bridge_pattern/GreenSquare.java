package bridge_pattern;

public class GreenSquare implements DrawAPI{

    @Override
    public void drawSquare(int x) {
        System.out.println("Drawing Square [ Colod: Green, sideLength = " + x + " ]");
    }
    
}