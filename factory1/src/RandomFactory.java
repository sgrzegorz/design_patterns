import java.util.ArrayList;
import java.util.Random;

public class RandomFactory {
    ArrayList<Animal> animals;

    public RandomFactory(ArrayList<Animal> zwierzeta){
        this.animals = zwierzeta;
    }



    public Animal createAnimal() {

        Random rand = new Random();
        int randomNum = rand.nextInt(((animals.size()-1) - 0) + 1) + 0;
        Animal choosedAnimal = animals.get(randomNum);

        return choosedAnimal;
    }
}
