//KAWA
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
	
	public double cost() {
		return .89;
	}

	@Override
	public String getSize() {
		return size;
	}

}
