package com.VoidCallerZ.UltimateGearCompression.items.tools;

import com.VoidCallerZ.UltimateGearCompression.Main;
import com.VoidCallerZ.UltimateGearCompression.init.ModItems;
import com.VoidCallerZ.UltimateGearCompression.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.ULTIMATE_GEAR_COMPRESSION_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.m_Proxy.registerItemRenderer(this, 0, "inventory");
	}
}
