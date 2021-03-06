package factory;

import factory.pizza.*;


public class NYPizzaStore extends PizzaStore{

    public Pizza createPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        }else if(type.equals("clam")){
            pizza = new NYStyleClamPizza();
        }else if(type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }else return null;
        return pizza;
    }
}
