import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ObservableWeatherStation extends Observable{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public ObservableWeatherStation() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
