package headfirst_design_pattern.StrategyPattern.SimUDuck.version1;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-08 21:39
 * @description: 野鸭 mallard
 **/
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("外观是绿头");
    }
}
