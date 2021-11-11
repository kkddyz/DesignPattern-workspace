package headfirst_design_pattern.FactoryPattern.abstractFactory.pizza;

import headfirst_design_pattern.FactoryPattern.abstractFactory.PizzaIngredientFactory;

/**
 * pizza 依赖于原料工厂
 * 不同的Pizza有着不同的成员变量，而原料工厂为成员变量赋值
 *
 * pizza只知道如何制作pizza而不关心原料；
 * 所以 Pizza类 和 区域原料是解耦的
 */
public class ChessPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ChessPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    /**
     * 干酪比萨只有 面团，酱汁，干酪；
     */
    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        chess = ingredientFactory.createChess();
    }
}
