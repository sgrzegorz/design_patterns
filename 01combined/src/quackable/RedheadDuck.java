package quackable;
import observer.*;


public class RedheadDuck implements Quackable {
    Observable observable;

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    ///////////////OBSERVABLE
    public RedheadDuck(){
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