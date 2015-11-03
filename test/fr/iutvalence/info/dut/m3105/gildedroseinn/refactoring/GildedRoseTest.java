package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GildedRoseTest
{
	
	public static final Item ITEM = new Item("testOne", 50, 100);
	public static final Item ITEM_TWO = new Item("testTwo", 70, 80);
	public static final Item ITEM_THREE = new Item("testThree", 1, 8);
	public static final Item ITEM_QUALITY_NULL = new Item("testThree", 3, 0);
	public static final Item BRIE = new Item("Aged Brie", 2, 0);
	
	
	@Test
	public void decrementSellInTestForAnItem()
	{

		int valSellInDayOne = ITEM.getSellIn();
		
		GildedRose.updateItem(ITEM);
		
		assertEquals(valSellInDayOne-1, ITEM.getSellIn());
	}
	
	@Test
	public void decrementQualityForAnItem(){
		
		getItemAndTestQuality(ITEM_TWO);
	}

	
	@Test
	public void decrementQualityForAnItemWhoHasASellInWhoBecameNegative(){
		int valQualityDayTwo;
		
		getItemAndTestQuality(ITEM_THREE);
		GildedRose.updateItem(ITEM_THREE);
		valQualityDayTwo = ITEM_THREE.getQuality();
		GildedRose.updateItem(ITEM_THREE);
		assertEquals(valQualityDayTwo -2, ITEM_THREE.getQuality());
	}

	@Test
	public void testIfQualityNeverBecameNegative(){
		int valQualityCurrentDay;
		int valQualityNextDay;
		int nbDay;
		for(nbDay=0; nbDay < 5; nbDay++){
			valQualityCurrentDay = ITEM_QUALITY_NULL.getQuality();
			GildedRose.updateItem(ITEM_QUALITY_NULL);
			valQualityNextDay = ITEM_QUALITY_NULL.getQuality();
			assertEquals(valQualityCurrentDay, valQualityNextDay);
		}
	}
	
	@Test
	public void testIfQualityForBrieExeption(){
		int valQualityCurrentDay;
		int valQualityNextDay;
		int nbDay;
		for(nbDay=0; nbDay < 5; nbDay++){
			valQualityCurrentDay = BRIE.getQuality();
			GildedRose.updateItem(BRIE);
			valQualityNextDay = BRIE.getQuality();
			assertEquals(valQualityCurrentDay+1, valQualityNextDay);
		}
	}
	
	
	
	private void getItemAndTestQuality(Item item) {
		int valQualityDay = item.getQuality();
		
		GildedRose.updateItem(item);
		assertEquals(valQualityDay-1, item.getQuality());
	}
}