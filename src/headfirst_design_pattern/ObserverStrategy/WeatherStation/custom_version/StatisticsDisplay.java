package headfirst_design_pattern.ObserverStrategy.WeatherStation.custom_version;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-12 17:45
 * @description:
 **/
public class StatisticsDisplay implements Observer,DisplayElement{
    // 构建桥梁 注册到subject
    private Subject subject;

    public StatisticsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }
    // 更新并显示数据
    private double temp;
    private double humidity;
    private double pressure;

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temp = temp+1.3;
        this.humidity = humidity*1.1;
        this.pressure = pressure-10;
        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: ");
        System.out.println(temp);
        System.out.println(humidity);
        System.out.println(pressure);
    }
}
