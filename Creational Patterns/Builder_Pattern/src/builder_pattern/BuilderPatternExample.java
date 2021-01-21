package builder_pattern;

public class BuilderPatternExample {
    
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Vegetable Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());
        
        System.out.print("\n");
        
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Vegetable Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }   
}
