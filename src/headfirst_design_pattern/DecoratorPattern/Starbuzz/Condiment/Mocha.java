package headfirst_design_pattern.DecoratorPattern.Starbuzz.Condiment;


import headfirst_design_pattern.DecoratorPattern.Starbuzz.Baverage.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
        condimentPrice = 0.2;
    }

    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
