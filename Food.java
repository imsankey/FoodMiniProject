package CollectionDemo;

public class Food
{
	int foodId;
	String foodName,foodType;
	double foodPrice;
	
	public Food(int foodId, String foodName, String foodType, double foodPrice) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodType = foodType;
		this.foodPrice = foodPrice;
	}
	
	public int getFoodId() {
		return foodId;
	}



	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}



	public String getFoodName() {
		return foodName;
	}



	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}



	public String getFoodType() {
		return foodType;
	}



	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}



	public double getFoodPrice() {
		return foodPrice;
	}



	public void setFoodPrice(double foodPrice) {
		this.foodPrice = foodPrice;
	}

	


	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + ", foodType=" + foodType + ", foodPrice="
				+ foodPrice + "]";
	}



}
