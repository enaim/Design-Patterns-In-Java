package abstract_factory_pattern;

public class AbstractFactoryPatternExample {

    public static void main(String[] args) {
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        
        Shape shape1 = shapeFactory1.getShape("Rectangle");
        Shape shape2 = shapeFactory1.getShape("Square");
        shape1.draw();
        shape2.draw();
        
        System.out.print("\n");
        
        AbstractFactory shapeFactory2 = FactoryProducer.getFactory(false);
        Shape shape3 = shapeFactory2.getShape("Rectangle");
        Shape shape4 = shapeFactory2.getShape("Square");
        shape3.draw();
        shape4.draw();
    }
}
