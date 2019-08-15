public class Main {
    public static void main(String[] args){
        ObservableWeatherStation observableWeatherStation = new ObservableWeatherStation();
        ObserverPhone phone = new ObserverPhone(observableWeatherStation);
        observableWeatherStation.setMeasurements(80,65,30.4f);
        phone.display();
        observableWeatherStation.setMeasurements(82,70,29.2f);
        phone.display();
        observableWeatherStation.setMeasurements(78,90,29.2f);
        phone.display();
    }
}
