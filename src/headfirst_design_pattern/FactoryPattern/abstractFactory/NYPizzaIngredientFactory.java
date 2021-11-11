package headfirst_design_pattern.FactoryPattern.abstractFactory;

import headfirst_design_pattern.FactoryPattern.abstractFactory.ingredient.*;

/**
 * 纽约的原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();//大蒜番茄酱汁
    }

    @Override
    public Chess createChess() {
        return new ReggianoChess(); //Reggiano干酪
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic()/*大蒜*/,new Onion()/*洋葱*/,new Mushroom()/*蘑菇*/,new RedPepper()/*红椒*/};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicesPepperoni(); //切片香肠
    }

    @Override
    public Clams createClam() {
        return new FreshClams();// 新鲜蛤蜊
    }
}
