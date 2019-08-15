import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();

}
