import iterable.DinerMenu;
import iterable.Menu;
import iterable.PancakeHouseMenu;
import pkg.Waitress;

public class Main {
    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
