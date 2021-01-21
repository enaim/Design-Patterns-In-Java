package builder_pattern;

public class Coke extends ColdDrink{
    @Override
    public double price(){
        return 30.0;
    }
    @Override
    public String name(){
        return "Coke";
    }
}
