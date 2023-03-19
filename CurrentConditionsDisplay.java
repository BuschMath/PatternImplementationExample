public class CurrentConditionsDisplay extends AbstractDisplayElement implements Observer {
    private double temperature;
    private double humidity;
    private DisplayStrategy displayStrategy;

    public CurrentConditionsDisplay(DisplayStrategy displayStrategy) {
        this.displayStrategy = displayStrategy;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        displayStrategy.display(temperature, humidity, 0);
    }
}
