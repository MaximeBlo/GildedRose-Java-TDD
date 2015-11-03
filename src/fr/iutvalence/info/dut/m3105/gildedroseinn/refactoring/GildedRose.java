package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import java.util.List;

public class GildedRose
{

	/*
	 * The code below is intended to help writing test fixtures
	 * 
	 * items = new ArrayList<Item>(); 
	 * items.add(new Item("+5 Dexterity Vest", 10, 20)); 
	 * items.add(new Item("Aged Brie", 2, 0)); 
	 * items.add(new Item("Elixir of the Mongoose", 5, 7)); 
	 * items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80)); 
	 * items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)); 
	 * items.add(new Item("Conjured Mana Cake", 3, 6));
	 */

	public static void updateItems(List<Item> items)
	{
		for (int indexInItemList = 0; indexInItemList < items.size(); indexInItemList++)
			updateItem(items.get(indexInItemList));
	}

	public static void updateItem(Item item)
	{	
		checkItem(item);
	}

	
	private static void checkItem(Item item) {
		switch(item.getName()){
		
		case "Aged Brie":
			//TODO INCREASE QUALITY!!!
			break;
		default:
			decreaseSellIn(item);
			decreaseQuality(item);
			break;
		}
	}

	private static void decreaseSellIn(Item item) {
		item.setSellIn(item.getSellIn()-1);
	}
	
	
	private static void decreaseQuality(Item item) {
		int itemQuality = item.getQuality();
		if(item.getSellIn() < 0)
			item.setQuality(itemQuality -2);		
		else
			item.setQuality(itemQuality-1);
		checkPositiveQuality(item);
	}

	
	private static void checkPositiveQuality(Item item) {
		if(item.getQuality() < 0)
			item.setQuality(0);		
	}
	
	

}
