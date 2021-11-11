package headfirst_design_pattern.ObserverStrategy.WeatherStation.custom_version;

import java.util.ArrayList;

/**
 * @program: HeadFirstDesignPatterns
 * @author: kkddyz
 * @create: 2020-05-12 16:59
 * @description:
 **/
public class WeatherData implements Subject{
    // Subject是数据的管理者
    private double temp;
    private double humidity;
    private double pressure;

    // 当数据以某种形式变化 会通知Observer
    public void measurementsChanged(){
        notifyObserver();
    }
    // 通过 setWeatherData 手动设置气象站的数据来模拟气象变化。
    public void setWeatherData(double temp,double humidity,double pressure){
        /**
         * @Description: 手动设置气象站的数据来模拟气象变化。
         * @Param: [temp, humidity, pressure]
         * @return: void
         */
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    ///////////////////// 以上 建立气象站基础   /////////////////////////////////////////////////////////////////////////////

    ///////////////////// 下面 实现subject接口 /////////////////////////////////////////////////////////////////////////////
    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i>=0){
            // 如果元素不存在的话 返回-1
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i <observers.size() ; i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temp,humidity,pressure);
        }
    }
}
