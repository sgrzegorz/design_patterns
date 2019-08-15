package quackable;

import observer.*;
import quackable.*;


//decorator
public class QuackCounter implements Quackable {
    Observable observable;
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck){
        observable = new Observable(this);
        this.duck=duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }

    ///////////////OBSERVABLE
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
