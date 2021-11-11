package headfirst_design_pattern.FactoryPattern.SimpleFactory;

/**
 *使用简单工厂
 */
public  class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    public Pizza orderPizza(String type){

        // 创建对象
        Pizza pizza = factory.createPizza(type);

        // 处理对象
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}