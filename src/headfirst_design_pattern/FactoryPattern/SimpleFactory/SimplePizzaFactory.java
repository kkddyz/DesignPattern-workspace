package headfirst_design_pattern.FactoryPattern.SimpleFactory;

public class SimplePizzaFactory{


    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("chess")/*芝士披萨*/){
            pizza = new CheesePizza();
        } else if (type.equals("greek"/*希腊风味披萨*/)){
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni"/*意大利辣香肠比萨饼*/)){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}