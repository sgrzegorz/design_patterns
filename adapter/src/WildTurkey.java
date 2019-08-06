public class WildTurkey implements Turkey {
    Turkey tureky;

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Iam flying a short distance");
    }
}
