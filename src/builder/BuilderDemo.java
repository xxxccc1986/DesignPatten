package builder;

/**
 * @author hcxs1986
 * @version 1.0
 * @description: 相当于客户类
 * 说说自己对建造者模式的理解？
 * 建造者模式实际上内部创建对象的复杂过程并没有对外暴露，通过一个builder类即可获得构造对象
 * 内部的类之间存在一定的依赖关系
 * @date 2022/10/3 20:12
 */
public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.showVegMeal();
        meal.showItem();
    }
}
