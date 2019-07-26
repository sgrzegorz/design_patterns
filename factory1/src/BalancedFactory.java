import java.util.ArrayList;
import java.util.Random;

public class BalancedFactory implements AnimalFactory{

    ArrayList<Animal> zwierzeta;
    ArrayList <Animal> t = null;

    public BalancedFactory(ArrayList<Animal> zwierzeta){
        this.zwierzeta = zwierzeta;
    }


//    @Override
//    public Animal createAnimal() {
////        if( t.size() == 0){
////            ArrayList <Animal> t = new ArrayList<>(zwierzeta);
////        }
////        Animal k = t[0];
////
////        for(Animal i : t){
////            i.sayYourName();
////        }
////
////        Random rand = new Random();
////        int randomNum = rand.nextInt((t.size() - 0) + 1) + 0;
////
////        Animal created = t[randomNum]
////        t.remove(randomNum);
////
//
//    }
}
