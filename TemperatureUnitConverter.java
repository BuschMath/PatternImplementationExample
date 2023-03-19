public class TemperatureUnitConverter extends AbstractDisplayElement {
    private DisplayElement displayElement;

    public TemperatureUnitConverter(DisplayElement displayElement) {
        this.displayElement = displayElement;
    }

    @Override
    public void display() {
        displayElement.display();
        convertTemperature();
    }

    private void convertTemperature() {
        // Code to convert Fahrenheit to Celsius
        // ...
        System.out.println("(Converted to Celsius)");
    }
}

