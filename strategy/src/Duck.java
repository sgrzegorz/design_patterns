public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    AttackBehavior attackBehavior;
    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("all duck swim");
    }

    public void attack(){
        attackBehavior.attack();
    }
}