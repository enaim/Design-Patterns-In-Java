package bridge_pattern;

public abstract class Shape {
    protected DrawAPI drawAPI;
    Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}