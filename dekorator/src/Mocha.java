//concerete decoratorA
public class Mocha extends CondimentDecorator{
	Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public String getSize() {
		return beverage.getSize();
	}


	public double cost() {
		String type = getSize();

		if (type == "small"){
			return .10 + beverage.cost();
		}else if( type == "medium"){
			return .20 + beverage.cost();
		}else if( type == "large"){
			return .20 + beverage.cost();
		}else{
			System.out.println("mocha error");
			return -11000;
		}


	}
}
