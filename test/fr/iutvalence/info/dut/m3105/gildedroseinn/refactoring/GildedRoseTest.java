package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void decrementSellInTestForAnItems()
	{
		ArrayList<Item> itemList;
		
		itemList = new ArrayList<Item>(); 
		itemList.add(new Item("testOne", 50, 100));
		
		int valSellInDayOne = itemList.get(0).getSellIn();
		
		GildedRose.updateItems(itemList);
		
		assertEquals(valSellInDayOne-1, itemList.get(0).getSellIn());
	}

}