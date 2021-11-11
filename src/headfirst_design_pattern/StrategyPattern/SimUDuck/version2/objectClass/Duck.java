package headfirst_design_pattern.StrategyPattern.SimUDuck.version2.objectClass;

import StrategyPattern.SimUDuck.version2.behaviorClass.Interface.FlyBehavior;
import StrategyPattern.SimUDuck.version2.behaviorClass.Implment.FlyBehaviorImpl;
import StrategyPattern.SimUDuck.version2.behaviorClass.Interface.QuackBehavior;
import StrategyPattern.SimUDuck.version2.behaviorClass.Implment.QuackBehaviorImplGua;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-09 15:37
 * @description:
 **/

// duck不可以实例化
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;


    public Duck(){
        /** 设置默认的fly,quack行为*/
        this.flyBehavior = new FlyBehaviorImpl();
        this.quackBehavior = new QuackBehaviorImplGua();
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        /** 自定义默认的行为*/
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    // set 行为

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // get 行为 允许子类修改从父类继承的行为

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    // exec 行为
    public void fly(){
        flyBehavior.doFly();
    }

    public void quack(){
        quackBehavior.doQuack();
    }

}
