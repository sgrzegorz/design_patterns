package quackable;

import quackable.Quackable;

import java.util.ArrayList;
import java.util.Iterator;
import observer.*;


//flock gromada stado
public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }


    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }

    }


    ///////////////OBSERVABLE

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);
        }

    }

    @Override
    public void notifyObservers() {

    }

    ////////////////////////////////////////////
}
