package headfirst_design_pattern.FactoryPattern.abstractFactory;


import headfirst_design_pattern.FactoryPattern.abstractFactory.pizza.ChessPizza;
import headfirst_design_pattern.FactoryPattern.abstractFactory.pizza.ClamPizza;
import headfirst_design_pattern.FactoryPattern.abstractFactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{
    Pizza pizza;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();


    @Override
    Pizza createPizza(String item) {
        if (item.equals("chess")){
            // 决定pizza类型 并绑定 原料
            pizza = new ChessPizza(ingredientFactory);
            pizza.setName("New York Style Chess Pizza");
        }else if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
