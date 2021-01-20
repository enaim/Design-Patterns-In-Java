package prototype_pattern;

public class PrototypePatternExample {

    public static void main(String[] args) {
        ShapeCache.loadCache();
        
        Shape cloneCircle = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + cloneCircle.getType());
        
        Shape cloneSquare = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape: " + cloneSquare.getType());
        
        Shape cloneRectangle = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape: " + cloneRectangle.getType());
    }
}
