package com.VoidCallerZ.UltimateGearCompression.items;

import com.VoidCallerZ.UltimateGearCompression.Main;
import com.VoidCallerZ.UltimateGearCompression.init.ModItems;
import com.VoidCallerZ.UltimateGearCompression.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.m_Proxy.registerItemRenderer(this, 0, "inventory");
	}
}
