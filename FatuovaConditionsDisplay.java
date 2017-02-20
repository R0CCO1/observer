/**
 * Created by Rocco on 2/20/17.
 */
public class FatuovaConditionsDisplay {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public SchaperConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Fatuova Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
