package headfirst_design_pattern.StrategyPattern.SimUDuck.version1;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-08 21:42
 * @description: 红头鸭子
 **/
public class RedHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("外观是红头");
    }
}
