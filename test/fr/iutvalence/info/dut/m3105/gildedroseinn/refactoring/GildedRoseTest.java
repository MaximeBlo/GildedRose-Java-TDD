package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	
	public static final Item ITEM = new Item("testOne", 50, 100);
	public static final Item ITEM_TWO = new Item("testTwo", 70, 80);
	public static final Item ITEM_THREE = new Item("testThree", 1, 8);
	
	@Test
	public void decrementSellInTestForAnItem()
	{

		int valSellInDayOne = ITEM.getSellIn();
		
		GildedRose.updateItem(ITEM);
		
		assertEquals(valSellInDayOne-1, ITEM.getSellIn());
	}
	
	@Test
	public void decrementQualityForAnItem(){
		
		int valQualityDayOne = ITEM_TWO.getQuality();
		
		GildedRose.updateItem(ITEM_TWO);
		assertEquals(valQualityDayOne -1, ITEM_TWO.getQuality());
	}
	
	@Test
	public void decrementQualityForAnItemWhoHasASellInWhoBecameNegative(){
		int valQualityDayOne = ITEM_THREE.getQuality();
		int valQualityDayTwo;
		
		GildedRose.updateItem(ITEM_THREE);
		valQualityDayTwo = ITEM_THREE.getQuality();
		
		assertEquals(valQualityDayOne -1, ITEM_THREE.getQuality());
		
		GildedRose.updateItem(ITEM_THREE);
		assertEquals(valQualityDayTwo -2, ITEM_THREE.getQuality());
	}


}