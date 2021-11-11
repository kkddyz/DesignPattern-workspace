package headfirst_design_pattern.ObserverStrategy.WeatherStation.custom_version;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-12 17:27
 * @description:
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // 注册到subject
    private Subject subject;

    //有点问题 这个类的构造函数必须要一个Subject意味着这个类一定是一个Observer，所以这个类不会有其他的用途。
    // 逻辑上 它先是Observer然后才是一个布告板类
    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    private double temp;
    private double humidity;
    private double pressure;

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay: ");
        System.out.println(temp);
        System.out.println(humidity);
        System.out.println(pressure);
    }
}
