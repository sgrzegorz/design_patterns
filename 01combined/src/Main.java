import factory.*;
import observer.Quackologist;
import quackable.*;
import quackable.Flock;
import quackable.QuackCounter;


public class Main {
    public static void main(String[] args) {
        Main simulator = new Main();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }
    void simulate(AbstractDuckFactory duckFactory) {
        // create duck factories and ducks here
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\n DUCK SIMULATOR WITH COMPOSITE FLOCKS");
        // create flocks here
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        flockOfDucks.add(flockOfMallards);


        System.out.println("\nDuck Simulator with observer");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);


        System.out.println("The duck quacked "+ QuackCounter.getQuacks()+" times");
    }


    void simulate(Quackable duck) {
        duck.quack();
    }
}
