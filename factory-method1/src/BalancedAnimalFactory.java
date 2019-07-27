import java.util.ArrayList;
import java.util.Random;

public class BalancedAnimalFactory implements AnimalFactory{

    ArrayList<Animal> animals;
    ArrayList <Animal> randAnimals = null;

    public BalancedAnimalFactory(ArrayList<Animal> zwierzeta){
        this.animals = zwierzeta;
    }


    @Override
    public Animal createAnimal() {

        if(randAnimals == null || randAnimals.size()==0 ){
            randAnimals = new ArrayList<Animal>(animals.size());
            for (Animal item : animals) randAnimals.add(item.clone());
        }

        Random rand = new Random();
        int randomNum = rand.nextInt(((randAnimals.size()-1) - 0) + 1) + 0;
        Animal choosedAnimal = randAnimals.get(randomNum);
        randAnimals.remove(randomNum);






        return choosedAnimal;
    }
}
