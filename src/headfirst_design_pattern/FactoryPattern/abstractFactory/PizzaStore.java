package headfirst_design_pattern.FactoryPattern.abstractFactory;


import headfirst_design_pattern.FactoryPattern.abstractFactory.pizza.Pizza;

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
