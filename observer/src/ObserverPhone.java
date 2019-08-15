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
        if (obs instanceof ObservableWeatherStation){
            ObservableWeatherStation observableWeatherStation = (ObservableWeatherStation) obs;
            this.temperature = observableWeatherStation.getTemperature();
            this.humidity = observableWeatherStation.getHumidity();
            display();
        }

    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }


}
