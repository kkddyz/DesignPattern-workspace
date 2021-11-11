package headfirst_design_pattern.DecoratorPattern.Starbuzz.Baverage;

public class Espresso extends Beverage {

    public Espresso() {
        // 父类中description不是在构造器里定义的，所以这里也不需要调用父类构造器初始化
        // 这个构造器本身就是一个装饰器(是父类构造器的装饰器)
        description = "Espresso";
        price = 1.99;
    }


}
