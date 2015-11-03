package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	
	public static final Item ITEM = new Item("testOne", 50, 100);
	
	@Test
	public void decrementSellInTestForAnItem()
	{

		int valSellInDayOne = ITEM.getSellIn();
		
		GildedRose.updateItem(ITEM);
		
		assertEquals(valSellInDayOne-1, ITEM.getSellIn());
	}
	
	@Test
	public void decrementQualityForAnItem(){
		
		int valQualityDayOne = ITEM.getQuality();
		
		GildedRose.updateItem(ITEM);
		assertEquals(valQualityDayOne -1, ITEM.getQuality());
	}

}