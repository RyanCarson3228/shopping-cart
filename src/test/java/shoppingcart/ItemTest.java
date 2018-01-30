package shoppingcart;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest {

	@Test
	public void shouldInstantiateAnItemObject() {
		// assert
		Item underTest = new Item();
		// act
		// arrange
		Assert.assertNotNull(underTest);
	}

	@Test
	public void shouldInstantiateItemwithNameAndPriceAndQuantity() {
		Item underTest = new Item("", 0, 0);

		Assert.assertNotNull(underTest);
	}

	@Test
	public void shouldReturnNameAsPeach() {
		Item underTest = new Item("Peach", 0, 0);
		String check = underTest.getName();

		Assert.assertEquals("Peach", check);
	}

	@Test
	public void shouldReturnPriceAsADollar() {
		Item underTest = new Item("", 1.00, 0);
		double check = underTest.getPrice();

		Assert.assertEquals(1.00, check, .001);
	}

	@Test
	public void shouldReturnQuantityAsThree() {
		Item underTest = new Item("", 0, 3);
		int check = underTest.getQuantity();

		Assert.assertEquals(3, check);
	}
	
	@Test
	public void shouldHaveToString() {
		Item underTest = new Item("Peach", 1.00, 3);
		String check = underTest.toString();
		String expected = "Item{Name: Peach, Price: 1.0, Quantity: 3}";
		Assert.assertEquals(expected, check);
	}
	
	@Test
	public void shouldHaveToStringInputs() {
		Item underTest = new Item("Pomegranates", 2.19, 5);
		String check = underTest.toString();
		String expected = "Item{Name: Pomegranates, Price: 2.19, Quantity: 5}";
		Assert.assertEquals(expected, check);
	}
}
