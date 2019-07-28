public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ula ordered a " + pizza.getName() + " \n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Kasia ordered a " + pizza.getName() + " \n");
    }
}
