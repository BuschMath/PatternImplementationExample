public class WeatherStationClient {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayStrategy currentConditionsDisplayStrategy = new CurrentConditionsDisplayStrategy(weatherData);
        DisplayStrategy forecastDisplayStrategy = new ForecastDisplayStrategy(weatherData);
        Observer currentConditionsDisplay = new CurrentConditionsDisplay(currentConditionsDisplayStrategy);
        Observer forecastDisplay = new ForecastDisplay(forecastDisplayStrategy);
        WeatherComponent weatherStation = new WeatherStation("Weather Station");

        weatherData.registerObserver(currentConditionsDisplay);
        weatherData.registerObserver(forecastDisplay);

        DisplayElement currentConditionsDisplayElement = (DisplayElement) currentConditionsDisplay;
        DisplayElement forecastDisplayElement = (DisplayElement) forecastDisplay;

        weatherStation.add(new WeatherDataDisplay("Current Conditions", currentConditionsDisplayElement));
        weatherStation.add(new WeatherDataDisplay("Forecast", forecastDisplayElement));

        DisplayElement currentConditionsDisplayWithCelsius = new TemperatureUnitConverter(currentConditionsDisplayElement);
        DisplayElement forecastDisplayWithCelsius = new TemperatureUnitConverter(forecastDisplayElement);

        weatherStation.add(new WeatherDataDisplay("Current Conditions in Celsius", currentConditionsDisplayWithCelsius));
        weatherStation.add(new WeatherDataDisplay("Forecast in Celsius", forecastDisplayWithCelsius));

        weatherData.setMeasurements(80, 65, 30.4);
        weatherData.setMeasurements(82, 70, 29.2);
        weatherData.setMeasurements(78, 90, 29.2);

        weatherStation.display();
    }
}

