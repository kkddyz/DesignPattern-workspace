package headfirst_design_pattern.ObserverStrategy.WeatherStation.Build_in_version;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: kkddyz
 * @create: 2020-05-18 12:40
 **/
public class CurrentConditionsDisplay implements Observer {
    private double temp;
    private double humidity;
    Observable observable;

    public CurrentConditionsDisplay(Observable obs) {
        this.observable = obs;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    private void display() {
        System.out.println("temp: "+temp);
        System.out.println("humidity: "+humidity);
    }
}
