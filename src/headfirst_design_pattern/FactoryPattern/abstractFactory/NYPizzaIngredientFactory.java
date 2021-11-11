package headfirst_design_pattern.FactoryPattern.abstractFactory;

import headfirst_design_pattern.FactoryPattern.abstractFactory.ingredient.*;

/**
 * 纽约的原料工厂
 * @author kkddyz
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        // 大蒜番茄酱料
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        //大蒜番茄酱汁
        return new MarinaraSauce();
    }

    @Override
    public Chess createChess() {
        //Reggiano干酪
        return new ReggianoChess();
    }

    @Override
    public Veggies[] createVeggies() {
        // 蔬菜s
        Veggies[] veggies = {new Garlic()/*大蒜*/,new Onion()/*洋葱*/,new Mushroom()/*蘑菇*/,new RedPepper()/*红椒*/};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        //切片香肠
        return new SlicesPepperoni();
    }

    @Override
    public Clams createClam() {
        // 新鲜蛤蜊
        return new FreshClams();
    }
}
