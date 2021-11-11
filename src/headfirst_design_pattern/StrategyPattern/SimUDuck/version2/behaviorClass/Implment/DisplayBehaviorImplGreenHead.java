package headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Implment;

import StrategyPattern.SimUDuck.version2.behaviorClass.Interface.DisplayBehavior;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-09 16:31
 * @description:
 **/
public class DisplayBehaviorImplGreenHead implements DisplayBehavior {

    @Override
    public void doDisplay() {
        System.out.println("鸭子是绿头");
    }
}
