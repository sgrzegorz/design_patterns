import attack.AttackKill;
import fly.FlyWithWings;
import quack.QuackLoud;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior = new QuackLoud();
        flyBehavior = new FlyWithWings();
        attackBehavior = new AttackKill();
    }

    public void display(){
        System.out.println("Jeee");
    }
}
