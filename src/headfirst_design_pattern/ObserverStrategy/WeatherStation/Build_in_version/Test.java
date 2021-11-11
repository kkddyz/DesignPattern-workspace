package headfirst_design_pattern.ObserverStrategy.WeatherStation.Build_in_version;

/**
 * @author: kkddyz
 * @create: 2020-05-18 12:45
 **/
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setWeatherData(12,12,12);
    }
}
