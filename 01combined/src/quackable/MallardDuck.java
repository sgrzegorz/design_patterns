package quackable;


import observer.*;


public class MallardDuck implements Quackable {
    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
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
    ///////////////////////////
}
