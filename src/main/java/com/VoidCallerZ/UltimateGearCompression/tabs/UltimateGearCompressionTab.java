package com.VoidCallerZ.UltimateGearCompression.tabs;

import com.VoidCallerZ.UltimateGearCompression.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class UltimateGearCompressionTab extends CreativeTabs
{
	public UltimateGearCompressionTab(String label)
	{
		super("ultimategearcompressiontab");
		this.setBackgroundImageName("ultimategearcompressiontab.png");
	}
	
	public ItemStack getTabIconItem()
	{
		return new ItemStack(ModItems.COMPRESSED_WOOD_PICKAXE);
	}
}
