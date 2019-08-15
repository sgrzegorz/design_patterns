package quackable;
import observer.*;


public class RubberDuck implements Quackable {
    Observable observable;

    public void quack() {
        System.out.println("Squeak");
    }



    ///////////////OBSERVABLE
    public RubberDuck(){
        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    ////////////////////////////////////////////
}
