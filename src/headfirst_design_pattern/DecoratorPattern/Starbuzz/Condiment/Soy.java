package headfirst_design_pattern.DecoratorPattern.Starbuzz.Condiment;


import headfirst_design_pattern.DecoratorPattern.Starbuzz.Baverage.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
        condimentPrice = 0.3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
