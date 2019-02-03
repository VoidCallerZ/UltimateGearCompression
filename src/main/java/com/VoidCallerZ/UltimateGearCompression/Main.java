package com.VoidCallerZ.UltimateGearCompression;

import com.VoidCallerZ.UltimateGearCompression.proxy.CommonProxy;
import com.VoidCallerZ.UltimateGearCompression.tabs.UltimateGearCompressionTab;
import com.VoidCallerZ.UltimateGearCompression.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, dependencies = "required-after:uc@[1.1.1]")
public class Main 
{
	public static final CreativeTabs ULTIMATE_GEAR_COMPRESSION_TAB = new UltimateGearCompressionTab("ultimate_gear_compression_tab");
	
	@Instance
	public static Main m_Instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy m_Proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}
