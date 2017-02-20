/**
 * Created by saradahdoh on 2/20/17.
 */
package HW6.observer;

public class DahdohConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public DahdohConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Dahdoh Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
