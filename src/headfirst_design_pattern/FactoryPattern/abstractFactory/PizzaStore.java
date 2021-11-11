package headfirst_design_pattern.FactoryPattern.abstractFactory;


import headfirst_design_pattern.FactoryPattern.abstractFactory.pizza.Pizza;

/**
 * 为客户提供需要的Pizza
 * Pizza是一个工厂吗？？ 不是因为它只是加工pizza。
 * @author kkddyz
 */
public abstract class PizzaStore{

    public Pizza orderPizza(String type){

        // 创建对象
        Pizza pizza = createPizza(type);

        // 处理对象
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);
}
