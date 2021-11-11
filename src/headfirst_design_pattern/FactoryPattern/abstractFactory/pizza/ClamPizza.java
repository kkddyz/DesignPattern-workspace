package headfirst_design_pattern.FactoryPattern.abstractFactory.pizza;

import headfirst_design_pattern.FactoryPattern.abstractFactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        chess = ingredientFactory.createChess();
        clam = ingredientFactory.createClam();
    }
}
