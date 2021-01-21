package builder_pattern;

public class ChickenBurger extends Burger{
    @Override
    public double price(){
        return 50.5;
    }
    @Override
    public String name(){
        return "Chicken Burger";
    }
}
