package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	@Test
	public void decrementSellInTestForAnItems()
	{
		
		Item item = new Item("testOne", 50, 100);
		
		int valSellInDayOne = item.getSellIn();
		
		GildedRose.updateItem(item);
		
		assertEquals(valSellInDayOne-1, item.getSellIn());
	}

}