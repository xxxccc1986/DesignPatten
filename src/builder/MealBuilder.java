package builder;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 进餐类的构造者类
 * @date 2022/10/3 20:06
 */
public class MealBuilder {
    public Meal showVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal showChickenMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
