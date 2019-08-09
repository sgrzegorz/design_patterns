import normal.*;
import with_hook.*;

public class Main {
    public static void main(String[]args){
//        Tea myTea = new Tea();
//        myTea.prepareRecipe();

        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();
        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();
        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();


    }
}
