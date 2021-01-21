package builder_pattern;

public class VegBurger extends Burger{
    @Override
    public double price(){
        return 25.0;
    }
    @Override
    public String name(){
        return "Vegetable Burger";
    }
}
