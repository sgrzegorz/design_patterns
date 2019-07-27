import java.util.ArrayList;
import java.util.Random;


public class Main {


    public int getNumber(){
        return 0;
    }

    public static void main(String []args){
        Animal a = new Animal();
        Animal b = (Animal) ((Animal) a).clone();

        ArrayList <Animal> zwierzaki = new ArrayList<>();
        zwierzaki.add(new Cat());
        zwierzaki.add(new Dog());
        zwierzaki.add(new Crocodile());
        BalancedFactory factory= new BalancedFactory(zwierzaki);

        for(int i=0;i<10;i++){
            factory.createAnimal().sayYourName();
        }







        Random rand = new Random();
        int randomNum = rand.nextInt(((zwierzaki.size()-1) - 0) + 1) + 0;
        zwierzaki.remove(randomNum);
        System.out.println(randomNum);

        for (Animal addd :zwierzaki){
            addd.sayYourName();
        }

//        ArrayList <Animal> t = new ArrayList<>(zwierzaki);
//
//
//        for(Animal i : t){
//            i.sayYourName();
//        }
//
//        Random rand = new Random();
//        int randomNum = rand.nextInt((t.size() - 0) + 1) + 0;
//
//        t.remove(randomNum);
//        System.out.println(t.size());
//
////        t.remove(0);
////        t.remove(0);
//        System.out.println(t.size());
//
//
//
//        System.out.println("hhh");
//
//
//        System.out.println(randomNum);

    }
}

