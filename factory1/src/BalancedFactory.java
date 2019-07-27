import java.util.ArrayList;
import java.util.Random;

public class BalancedFactory implements AnimalFactory{

    ArrayList<Animal> animals;
    ArrayList <Animal> randAnimals = null;

    public BalancedFactory(ArrayList<Animal> zwierzeta){
        this.animals = zwierzeta;
    }


    @Override
    public Animal createAnimal() {
        if(randAnimals.size()==0 || randAnimals == null){
            randAnimals = new ArrayList<Animal>(animals.size());
            for (Animal item : animals) randAnimals.add(item.clone());
        }

        Random rand = new Random();
        int randomNum = rand.nextInt(((randAnimals.size()-1) - 0) + 1) + 0;
        Animal choosedAnimal = randAnimals.get(randomNum);
        randAnimals.remove(randomNum);

        System.out.println(randomNum);




        return choosedAnimal;
    }
}
