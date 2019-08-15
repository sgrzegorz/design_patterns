package quackable;//WABIK

import observer.Observable;
import observer.Observer;
import quackable.*;


public class DuckCall implements Quackable {
    Observable observable;

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }


    ///////////////OBSERVABLE

    public DuckCall() {
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
