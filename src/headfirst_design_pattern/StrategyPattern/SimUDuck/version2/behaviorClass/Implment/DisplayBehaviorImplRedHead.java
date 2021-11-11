package headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Implment;


import headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Interface.DisplayBehavior;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-09 16:03
 * @description:
 **/
public class DisplayBehaviorImplRedHead implements DisplayBehavior {

    @Override
    public void doDisplay() {
        System.out.println("鸭子是红头");
    }
}
