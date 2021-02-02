package bridge_pattern;

public class Square extends Shape{
    private int sideLength;
    
    Square(int sideLength, DrawAPI drawAPI){
        super(drawAPI);
        this.sideLength = sideLength;
    }
    
    public void draw(){
        drawAPI.drawSquare(sideLength);
    }
}