package headfirst_design_pattern.DecoratorPattern.Starbuzz.Condiment;


import headfirst_design_pattern.DecoratorPattern.Starbuzz.Baverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    double condimentPrice;

    CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    //既然装饰类的方法需要全部重写 ，那我就在装置器的超类中定义好模板
    public abstract String getDescription();

    public double cost(){
        return beverage.cost()+condimentPrice;
    }
}
