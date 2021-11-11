package headfirst_design_pattern.DecoratorPattern.Starbuzz.Condiment;

import DecoratorPattern.Starbuzz.Baverage.Beverage;
import org.omg.CORBA.CODESET_INCOMPATIBLE;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        super(beverage);
        condimentPrice = 0.2;
    }

    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
}
