public class CurrentConditionsDisplayStrategy implements DisplayStrategy, Observer {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionsDisplayStrategy(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display(temperature, humidity, pressure);
    }

    public void display(double temperature, double humidity, double pressure) {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
