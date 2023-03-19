import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends WeatherComponent {
    private List<WeatherComponent> components = new ArrayList<>();

    public WeatherStation(String description) {
        this.description = description;
    }

    @Override
    public void add(WeatherComponent c) {
        components.add(c);
    }

    @Override
    public void remove(WeatherComponent c) {
        components.remove(c);
    }

    @Override
    public WeatherComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public void display() {
        System.out.println("\n" + description + "\n------------------");
        for (WeatherComponent c : components) {
            c.display();
        }
    }
}
