package shoppingcart;

import java.util.ArrayList;

public class Cart {

	private ArrayList<Item> items = new ArrayList<>();

	public void addItem(Item theItem) {
		items.add(theItem);

	}

	public int listSize() {

		return items.size();
	}

	public int getTotalItems() {
		int itemTotal = 0;

		for (Item quantity : items) {
			itemTotal += quantity.getQuantity();
		}
		return itemTotal;
	}

	public void removeItem(String item) {
		for (int i = items.size() - 1; i >= 0; i--) {
			if (items.get(i).getName().equals(item)) {
				items.remove(i);
			}
		}

	}

}
