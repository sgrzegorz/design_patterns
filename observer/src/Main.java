public class Main {
    public static void main(String[] args){
        ObservableWeather observableWeather = new ObservableWeather();
        ObserverPhone phone = new ObserverPhone(observableWeather);
        observableWeather.setMeasurements(80,65,30.4f);
        phone.display();
        observableWeather.setMeasurements(82,70,29.2f);
        phone.display();
        observableWeather.setMeasurements(78,90,29.2f);
        phone.display();
    }
}
