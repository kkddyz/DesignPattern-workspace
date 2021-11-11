package headfirst_design_pattern.DecoratorPattern.Starbuzz.Baverage;

public abstract class Beverage {
    // 不设置为private嘛？ 因为子类需要修改它
    String description = "Unknown Beverage";
    double price;
    public String getDescription() {
        return description;
    }

    public double cost(){
        return price;
    }
}
