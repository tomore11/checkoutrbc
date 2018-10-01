package checkoutrcb.model;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    public List<FruitBasket> fruitInCart = new ArrayList();
    private Checkout cart;
    
    //method to get all of the fruit in the Cart
    public List<FruitBasket> getAllFruit() {

        return this.fruitInCart;
    }

    //method to add fruit to the cart
    public void addFruit(FruitBasket cartItem){
        fruitInCart.add(cartItem);
    }

    //method to add up the total number of fruit in the cart
	public int sumQuantity() {
		int sum = 0;
		for (int i = 0; i < fruitInCart.size(); i++) {
			int itemPrice = fruitInCart.get(i).getQuantity();
			sum += fruitInCart.get(i).getQuantity();
		}
		return sum;
	}

	//method to calculate how much the user is spending per fruit, and print the total amount for the cart to the screen
	public double pricePerFruit() {
		double priceTotalPerFruit = 0;
		int quantity = 0;
		double price =0.0d;
		double priceTotal = 0.0d;
		for (int i = 0; i < fruitInCart.size(); i++) {
			quantity = fruitInCart.get(i).getQuantity();
			price = fruitInCart.get(i).getPrice();
			priceTotalPerFruit = quantity * price;
			System.out.println("The price for " + fruitInCart.get(i).getName() + "s is : " + priceTotalPerFruit);
			priceTotal += priceTotalPerFruit;
		}
		return priceTotal;
	}

}
