package quackable;

import observer.*;


public interface Quackable extends QuackObservable {
    public void quack();
}
