package headfirst_design_pattern.ObserverStrategy.WeatherStation.Build_in_version;

import java.util.Observable;

/**
 * @author: kkddyz
 * @create: 2020-05-18 01:07
 **/
public class WeatherData extends Observable {
    private double temp;
    private double humidity;
    private double pressure;

    public WeatherData() {
    }

    public void measurementsChanged(){
        // 数据改变 通知观察者
        setChanged();
        notifyObservers();
    }
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

    public double getTemp() {
        return temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }
}
