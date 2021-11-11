package headfirst_design_pattern.StrategyPattern.SimUDuck.version2.objectClass;

import StrategyPattern.SimUDuck.version2.behaviorClass.Interface.FlyBehavior;
import StrategyPattern.SimUDuck.version2.behaviorClass.Interface.QuackBehavior;
import StrategyPattern.SimUDuck.version2.behaviorClass.Interface.DisplayBehavior;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-09 16:00
 * @description:
 **/
public class RedHeadDuck extends Duck {

    // 新特性既不是父类那里继承的，也不是自己实现的，是通过接口注入的。
    private DisplayBehavior displayBehavior;

    public RedHeadDuck(DisplayBehavior displayBehavior){
        super();
        this.displayBehavior = displayBehavior;
    }
    public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior , DisplayBehavior displayBehavior) {
        super(flyBehavior, quackBehavior);

        this.displayBehavior = displayBehavior;
    }

    public void display(){
        this.displayBehavior.doDisplay();
    }

    // set接口实现类 动态的改变行为
    public void setDisplayBehavior(DisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        super.setQuackBehavior(quackBehavior);
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        super.setFlyBehavior(flyBehavior);
    }


}
