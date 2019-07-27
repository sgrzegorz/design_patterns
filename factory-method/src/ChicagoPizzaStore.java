public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }else return null;
        return pizza;
    }

}
