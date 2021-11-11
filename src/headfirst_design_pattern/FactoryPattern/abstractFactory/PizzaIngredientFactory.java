package headfirst_design_pattern.FactoryPattern.abstractFactory;

import headfirst_design_pattern.FactoryPattern.abstractFactory.ingredient.*;

public interface PizzaIngredientFactory {
    // 创建原料家族每一种原料
    public Dough createDough();
    public Sauce createSauce();
    public Chess createChess();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
