import java.util.*;

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
        ArrayList al = new ArrayList();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        Enumeration<String> enm = Collections.enumeration(al);
        EnumerationIterator itr = new EnumerationIterator(enm);
        while(itr.hasNext()){
            String t = (String) itr.next();
            System.out.println(t);
        }






    }
}
