package Ch2.Our;

import Ch2.Our.Displays.CurrentConditionsDisplay;
import Ch2.Our.Displays.ForecastDisplay;
import Ch2.Our.Displays.HeatIndexDisplay;
import Ch2.Our.Displays.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay conditionsDisplay =
                new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay =
                new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
