package headfirst_design_pattern.StrategyPattern.SimUDuck.version1;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-08 21:36
 * @description:
 **/
public abstract class Duck {

    public void quack(){
        System.out.println("呱呱呱");
    }

    public void swim(){
        System.out.println("正在游泳..");
    }
    public abstract void display();
}
