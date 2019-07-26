

//COMPONENT napój
public abstract class Beverage {
	protected String description = "Unknown beverage";
	protected String size = "unknown size";


	public String getDescription() {

		return description;
	}
	
	public abstract double cost();
	public abstract String getSize();
	public void setSize(String size){
		this.size = size;
	}


}