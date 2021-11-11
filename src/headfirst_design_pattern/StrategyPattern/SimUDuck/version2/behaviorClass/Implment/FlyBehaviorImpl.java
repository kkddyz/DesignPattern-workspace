package headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Implment;


import headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Interface.FlyBehavior;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-09 15:57
 * @description:
 **/
public class FlyBehaviorImpl implements FlyBehavior {

    @Override
    public void doFly() {
        System.out.println("鸭子在飞");
    }
}
