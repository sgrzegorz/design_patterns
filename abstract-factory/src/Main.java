import pizza.Pizza;

public class Main {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ula ordered a " + pizza.getName() + " \n");

        PizzaStore chicagoStore = new ChicagoPizzaStore();
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Kasia ordered a " + pizza.getName() + " \n");
    }
}
