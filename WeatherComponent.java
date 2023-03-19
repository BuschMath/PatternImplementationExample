public abstract class WeatherComponent {
    protected String description;

    public abstract void add(WeatherComponent c);
    public abstract void remove(WeatherComponent c);
    public abstract WeatherComponent getChild(int i);
    public abstract void display();
}
