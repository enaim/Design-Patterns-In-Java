package abstract_factory_pattern;

public class RoundedSquare implements Shape{
    @Override
    public void draw(){
        System.out.println("Inside Rounded-Square::draw() method.");
    }
}