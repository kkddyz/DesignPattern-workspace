package headfirst_design_pattern.StrategyPattern.SimUDuck.version2;


import headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Implment.DisplayBehaviorImplGreenHead;
import headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Implment.DisplayBehaviorImplRedHead;
import headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Implment.FlyBehaviorImpl;
import headfirst_design_pattern.StrategyPattern.SimUDuck.version2.behaviorClass.Implment.QuackBehaviorImplGu;
import headfirst_design_pattern.StrategyPattern.SimUDuck.version2.objectClass.RedHeadDuck;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-09 16:22
 * @description:
 **/
public class Test {
    public static void main(String[] args) {
        // 重载创建对象
        System.out.println("redHeadDuck: ");
        RedHeadDuck redHeadDuck = new RedHeadDuck(new FlyBehaviorImpl(),new QuackBehaviorImplGu(),new DisplayBehaviorImplRedHead());
        redHeadDuck.display();
        redHeadDuck.quack();
        redHeadDuck.fly();

        System.out.println("redHeadDuck1: ");
        RedHeadDuck redHeadDuck1 = new RedHeadDuck(new DisplayBehaviorImplRedHead());
        redHeadDuck1.display();
        redHeadDuck1.quack();
        redHeadDuck1.fly();

        // 运行时改变鸭子行为 -- 通过改变接口的指向的实例对象
        System.out.println("change behavior");
        System.out.println("redHeadDuck: ");
        redHeadDuck.setDisplayBehavior(new DisplayBehaviorImplGreenHead());
        redHeadDuck.display();

        System.out.println("redHeadDuck1: ");
        redHeadDuck1.setDisplayBehavior(new DisplayBehaviorImplGreenHead());
        redHeadDuck1.display();

    }
}
