import java.util.Observable;
import java.util.Observer;

public class ObserverPhone implements Observer {
    private float temperature;
    private float humidity;
    private Observable observable;

    public ObserverPhone(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs,Object arg) {
        if (obs instanceof ObservableWeather){
            ObservableWeather observableWeather = (ObservableWeather) obs;
            this.temperature = observableWeather.getTemperature();
            this.humidity = observableWeather.getHumidity();
            display();
        }

    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }


}
