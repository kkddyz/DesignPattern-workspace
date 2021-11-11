package headfirst_design_pattern.FactoryPattern.abstractFactory;

/**
 * @author kkddyz
 * @date 2021/11/11
 * @description
 */
public class Client {

    /**
     * PizzaStore是抽线对象，我们必须通过它的子类才能获得服务
     * 子类通过实现不同的createPizza()满足不同的服务
     */
    public void buyPizza(String pizzaStoreName){
        PizzaStore pizzaStore;
        if ("NewYork".equals(pizzaStoreName)){
            pizzaStore = new NYPizzaStore();
        }else {
            throw new RuntimeException("没有这家店");
        }
    }
    public static void main(String[] args) {

    }
}
