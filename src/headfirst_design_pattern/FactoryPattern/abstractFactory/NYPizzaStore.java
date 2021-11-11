package headfirst_design_pattern.FactoryPattern.abstractFactory;


import headfirst_design_pattern.FactoryPattern.abstractFactory.pizza.ChessPizza;
import headfirst_design_pattern.FactoryPattern.abstractFactory.pizza.ClamPizza;
import headfirst_design_pattern.FactoryPattern.abstractFactory.pizza.Pizza;

/**
 * @author kkddyz
 */
public class NYPizzaStore extends PizzaStore {
    Pizza pizza;

    /**
     * 专属原料工厂
     */
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();


    /**
     * 自定义风味
     */
    @Override
    Pizza createPizza(String item) {
        // 决定pizza类型,并使用原料工厂提供pizza需要的原料
        if ("chess".equals(item)) {
            pizza = new ChessPizza(ingredientFactory);
            pizza.setName("New York Style Chess Pizza");
        } else if ("clam".equals(item)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
