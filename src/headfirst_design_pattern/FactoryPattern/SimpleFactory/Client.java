package headfirst_design_pattern.FactoryPattern.SimpleFactory;

public class Client {

    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory); // 为store指定工厂

        Pizza pizza = pizzaStore.orderPizza("chess");
        System.out.println(pizza);
    }
}
