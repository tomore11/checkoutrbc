package checkoutrcb;

import org.junit.Before;
import org.junit.Test;

import checkoutrcb.model.Checkout;
import checkoutrcb.model.Fruit;
import checkoutrcb.model.FruitBasket;

import java.util.List;

import static org.junit.Assert.*;

public class CheckoutTest {

	Checkout cart;
	double applePrice = Fruit.APPLE.getPrice();
	double orangePrice = Fruit.ORANGE.getPrice();
	double pearPrice = Fruit.PEAR.getPrice();
	double lemonPrice = Fruit.LEMON.getPrice();
	double bananaPrice = Fruit.BANANA.getPrice();

	@Before
	public void SetUp() {
		Checkout cart = new Checkout();
	}

	@Test
	public void emptyCartTest() {
		// Arrange
		Checkout cart = new Checkout();

		// Act
		List<FruitBasket> fruitInCart = cart.getAllFruit();

		// Assert
		assertEquals(0, fruitInCart.size(), .00001);
	}

	@Test
	public void oneAppleInCartTest() {
		Checkout cart = new Checkout();
		cart.addFruit(new FruitBasket(Fruit.APPLE.toString(), 1, applePrice));

		int amountOfFruitInCart = cart.getAllFruit().size();

		assertEquals(1, amountOfFruitInCart, .000001);
	}
	
	@Test
	public void oneOfEachFruitInCart(){
		Checkout cart = new Checkout();
		cart.addFruit(new FruitBasket(Fruit.APPLE.toString(), 1, applePrice));
		cart.addFruit(new FruitBasket(Fruit.ORANGE.toString(), 1, orangePrice));
		cart.addFruit(new FruitBasket(Fruit.PEAR.toString(), 1, pearPrice));
		cart.addFruit(new FruitBasket(Fruit.LEMON.toString(), 1, lemonPrice));
		cart.addFruit(new FruitBasket(Fruit.BANANA.toString(), 1, bananaPrice));
		
		int amountOfFruitInCart = cart.getAllFruit().size();

		assertEquals(5, amountOfFruitInCart, .000001);
	}
	
	@Test
	public void multiplesOfEachFruitInCart(){
		Checkout cart = new Checkout();
		cart.addFruit(new FruitBasket(Fruit.APPLE.toString(), 3, applePrice));
		cart.addFruit(new FruitBasket(Fruit.ORANGE.toString(), 5, orangePrice));
		cart.addFruit(new FruitBasket(Fruit.PEAR.toString(), 2, pearPrice));
		cart.addFruit(new FruitBasket(Fruit.LEMON.toString(), 4, lemonPrice));
		cart.addFruit(new FruitBasket(Fruit.BANANA.toString(), 3, bananaPrice));
		
		int amountOfFruitInCart = cart.sumQuantity();

		assertEquals(17, amountOfFruitInCart, .000001);
	}
	
	@Test
	public void priceOfTotalFruitInCart(){
		Checkout cart = new Checkout();
	
		cart.addFruit(new FruitBasket(Fruit.APPLE.toString(), 3, applePrice));
		cart.addFruit(new FruitBasket(Fruit.ORANGE.toString(), 5, orangePrice));
		cart.addFruit(new FruitBasket(Fruit.PEAR.toString(), 2, pearPrice));
		cart.addFruit(new FruitBasket(Fruit.LEMON.toString(), 4, lemonPrice));
		cart.addFruit(new FruitBasket(Fruit.BANANA.toString(), 3, bananaPrice));
		
		double priceOfFruitInCart = cart.pricePerFruit();

		assertEquals(4.84, priceOfFruitInCart, .000001);
	}
	
	/* 
	 * If I had more time I would add in checks to ensure only positive integers were added,
	 * I would organise the code into a true MVC format
	 * I would make the format more pleasing 
	 * 
	 */
	 

}
