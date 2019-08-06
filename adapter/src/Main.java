import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args){
//        MallardDuck duck = new MallardDuck();
//        WildTurkey  turkey = new WildTurkey();
//        Duck turkeyAdapter = new TurkeyAdapter(turkey);
//
//        System.out.println("The turkey says ...");
//        turkey.gobble();
//        turkey.fly();
//
//        System.out.println("\nThe Duck says...");
//        testDuck(duck);
//        System.out.println("\nThe TurkeyAdapter says...");
//        testDuck(turkeyAdapter);
        Map<Integer,String> mapa = new HashMap<>();
        mapa.put(1,"jeden");
        mapa.put(2,"dwa");
        mapa.put(3,"trzy");
        mapa.put(4,"cztery");

        EnumerationIterator it = new EnumerationIterator(new ENIterator<Map.Entry<Integer,String>>);
        it.enum1 = mapa.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> pair = it.next();

        }


    }
}
