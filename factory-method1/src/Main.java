import java.util.ArrayList;


public class Main {


    public int getNumber(){
        return 0;
    }

    public static void main(String []args){

        ArrayList <Animal> zwierzaki = new ArrayList<>();
        zwierzaki.add(new Cat());
        zwierzaki.add(new Dog());
        zwierzaki.add(new Crocodile());
        AnimalFactory factory= new BalancedAnimalFactory(zwierzaki);



        for(int i=0;i<30;i++){
            if(i%3 ==0) System.out.print(i);

            factory.createAnimal().sayYourName();
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

