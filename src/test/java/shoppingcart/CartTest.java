package shoppingcart;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CartTest {
	
	@Test
	public void shouldInstantiateAMasterOrderObject() {
		Cart underTest = new Cart();

		Assert.assertNotNull(underTest);
	}
	
	@Test
	public void assertThatAnItemHasBeenAdded() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("", 0, 0));
		int check = underTest.listSize();
		Assert.assertEquals(1, check);
	}
	
	@Test
	public void assertThatTwoItemsHaveBeenAdded() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("", 0, 0));
		underTest.addItem(new Item("", 0, 0));
		int check = underTest.listSize();
		Assert.assertEquals(2, check);
	}
	
	@Test
	public void assertThatTotalNumberofItemsIsOne() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("", 0, 1));
		int check = underTest.getTotalItems();
		Assert.assertEquals(1,  check);
	}
	
	@Test
	public void assertThatTotalNumberofItemsIsTwo() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("", 0, 2));
		int check = underTest.getTotalItems();
		Assert.assertEquals(2,  check);
	}
	
	@Test
	public void assertThatGetTotalItemsIsThreeFromTwoOrders() {
		Cart underTest = new Cart();
		underTest.addItem(new Item("", 0, 2));
		underTest.addItem(new Item("", 0, 1));
		int check = underTest.getTotalItems();
		assertEquals(3, check);
	}
	
	@Test
	public void assertThatAnItemHasBeenRemoved() {
		//create object
		Cart underTest = new Cart();
		//add an item
		underTest.addItem(new Item("milk", 1.25, 2));
		//add another item
		underTest.addItem(new Item("chocolate", 0.50, 3));
		//remove one of the items
		underTest.removeItem("chocolate");
		//check the size of the list
		int check = underTest.getTotalItems();
		//run your assertion
		Assert.assertEquals(1, check);
	}

}
