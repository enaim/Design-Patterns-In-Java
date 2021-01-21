package builder_pattern;

public class Pepsi extends ColdDrink{
    @Override
    public double price(){
        return 35.0;
    }
    @Override
    public String name(){
        return "Pepsi";
    }
}
