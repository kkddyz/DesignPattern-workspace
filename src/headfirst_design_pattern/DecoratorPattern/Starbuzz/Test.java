package headfirst_design_pattern.DecoratorPattern.Starbuzz;


import headfirst_design_pattern.DecoratorPattern.Starbuzz.Baverage.Espresso;
import headfirst_design_pattern.DecoratorPattern.Starbuzz.Baverage.Whip;
import headfirst_design_pattern.DecoratorPattern.Starbuzz.Condiment.Mocha;
import headfirst_design_pattern.DecoratorPattern.Starbuzz.Condiment.Soy;

public class Test {

    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Mocha espresso1 = new Mocha(espresso);

        String description = espresso1.getDescription();
        double cost = espresso1.cost();

        System.out.println(description+": "+cost+"$");
        System.out.println("欢迎惠顾!");

        ///////////////////////////////////////////////////////////////////

        Whip whip = new Whip();
        Soy whip1 = new Soy(whip);
        Mocha whip2 = new Mocha(whip1);

        String description1 = whip2.getDescription();
        double cost1 = whip2.cost();

        System.out.println(description1+": "+cost1+"$");
        System.out.println("欢迎惠顾!");


    }
}
