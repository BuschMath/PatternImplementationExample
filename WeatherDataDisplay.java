public class WeatherDataDisplay extends WeatherComponent {
    private DisplayElement displayElement;

    public WeatherDataDisplay(String name, DisplayElement displayElement) {
        this.description = name;
        this.displayElement = displayElement;
    }

    @Override
    public void display() {
        System.out.println(this.description);
        displayElement.display();
        System.out.println();
    }

    @Override
    public void add(WeatherComponent component) {
        // Leaf node, so this method is not supported
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(WeatherComponent component) {
        // Leaf node, so this method is not supported
        throw new UnsupportedOperationException();
    }

    @Override
    public WeatherComponent getChild(int index) {
        // Leaf node, so this method is not supported
        throw new UnsupportedOperationException();
    }
}


