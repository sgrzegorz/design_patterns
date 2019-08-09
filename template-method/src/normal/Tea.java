package normal;

import normal.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    public void brew() { //przyrządz
        System.out.println("Steeping the tea"); //namaczanie
    }
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
