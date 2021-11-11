package headfirst_design_pattern.FactoryPattern.abstractFactory;

import headfirst_design_pattern.FactoryPattern.abstractFactory.ingredient.*;

/**
 * 创建原料家族的每一种原料
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Chess createChess();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
