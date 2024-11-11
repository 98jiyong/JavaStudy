package _15JavaOracle;

public class MyFoodDto {
	
	private String name = null;
	private String type = null;
	private int price = 0;
	private double favor = 0;
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getPrice() {
		return price;
	}
	public double getFavor() {
		return favor;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setFavor(double favor) {
		this.favor = favor;
	}
	
}
