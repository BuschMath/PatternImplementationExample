public class ForecastDisplay implements Observer, DisplayElement {
    private double pressure;
    private DisplayStrategy displayStrategy;

    public ForecastDisplay(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        displayStrategy.display(0, 0, pressure);
    }
}
