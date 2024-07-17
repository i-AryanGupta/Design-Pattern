package factory;

public class MainRun {
	public static void main(String[] args) {
		
		Food food = FoodFactory.getInstance(1, "Pizza");
		Food food2 = FoodFactory.getInstance(2, "Burger");
		String foodType = food.getFoodType();
		
		System.out.println(foodType);
		System.out.println(food2.getFoodType());
	}

}
