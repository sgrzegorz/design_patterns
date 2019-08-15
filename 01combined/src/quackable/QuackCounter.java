package quackable;

import observer.*;
import quackable.*;


//decorator
public class QuackCounter implements Quackable {

    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck){
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
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    ////////////////////////////////////////////
}
