package headfirst_design_pattern.FactoryPattern.facoty;

/**
 * 子类的create Pizza 相同的 pizza type 创建的是带有风味的pizza对象(可以理解为原来pizza的子类)
 * */
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