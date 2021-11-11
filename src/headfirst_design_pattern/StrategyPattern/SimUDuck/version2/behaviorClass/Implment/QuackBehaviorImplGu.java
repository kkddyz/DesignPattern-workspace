package headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Implment;

import StrategyPattern.SimUDuck.version2.behaviorClass.Interface.QuackBehavior;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-09 15:59
 * @description:
 **/
public class QuackBehaviorImplGu implements QuackBehavior {
    @Override
    public void doQuack() {
        System.out.println("咕咕咕");
    }
}
