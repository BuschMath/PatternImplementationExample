public class ForecastDisplayStrategy implements DisplayStrategy, Observer {
    private double currentPressure = 29.92;
    private double lastPressure;
    private Subject weatherData;

    public ForecastDisplayStrategy(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(double temperature, double humidity, double pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display(temperature, humidity, pressure);
    }

    public void display(double temperature, double humidity, double pressure) {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
