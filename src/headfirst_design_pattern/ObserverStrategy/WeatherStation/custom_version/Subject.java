package headfirst_design_pattern.ObserverStrategy.WeatherStation.custom_version;

// 接口Subject与Observer抽出了观察者模式的两个类的共性，这是可扩展的基础
// 通过接口来定义模式
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    public void notifyObserver();// 通知所有观察者
}
