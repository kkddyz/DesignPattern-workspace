package headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Implment;

import StrategyPattern.SimUDuck.version2.behaviorClass.Interface.QuackBehavior;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-09 15:58
 * @description:
 **/
public class QuackBehaviorImplGua implements QuackBehavior {
    @Override
    public void doQuack() {
        System.out.println("呱呱呱");
    }
}
