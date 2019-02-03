package com.VoidCallerZ.UltimateGearCompression.init;

import java.util.ArrayList;
import java.util.List;

import com.VoidCallerZ.UltimateGearCompression.items.armor.ArmorBase;
import com.VoidCallerZ.UltimateGearCompression.items.tools.ToolAxe;
import com.VoidCallerZ.UltimateGearCompression.items.tools.ToolHoe;
import com.VoidCallerZ.UltimateGearCompression.items.tools.ToolPickaxe;
import com.VoidCallerZ.UltimateGearCompression.items.tools.ToolSpade;
import com.VoidCallerZ.UltimateGearCompression.items.tools.ToolSword;
import com.VoidCallerZ.UltimateGearCompression.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Tool Materials
	public static final ToolMaterial MATERIAL_COMPRESSED_WOOD = EnumHelper.addToolMaterial("material_compressed_wood", 0, 540, 2.0f, 0, 15);
	public static final ToolMaterial MATERIAL_COMPRESSED_IRON = EnumHelper.addToolMaterial("material_compressed_iron", 2, 2259, 6.0f, 2, 14);
	public static final ToolMaterial MATERIAL_COMPRESSED_GOLD = EnumHelper.addToolMaterial("material_compressed_gold", 0, 297, 6.0f, 2, 14);
	public static final ToolMaterial MATERIAL_COMPRESSED_DIAMOND = EnumHelper.addToolMaterial("material_compressed_diamond", 2, 14058, 12.0f, 0, 22);
	
	//Iron Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_IRON_HELMET = EnumHelper.addArmorMaterial("armor_material_compressed_iron", Reference.MOD_ID + ":compressed_iron", 63, new int[] {3, 8, 6, 3}, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_IRON_CHESTPLATE = EnumHelper.addArmorMaterial("armor_material_compressed_iron", Reference.MOD_ID + ":compressed_iron", 75, new int[] {3, 8, 6, 3}, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_IRON_LEGGINGS = EnumHelper.addArmorMaterial("armor_material_compressed_iron", Reference.MOD_ID + ":compressed_iron", 66, new int[] {3, 8, 6, 3}, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_IRON_BOOTS = EnumHelper.addArmorMaterial("armor_material_compressed_iron", Reference.MOD_ID + ":compressed_iron", 75, new int[] {3, 8, 6, 3}, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f);
	
	//Gold Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_GOLD_HELMET = EnumHelper.addArmorMaterial("armor_material_compressed_gold", Reference.MOD_ID + ":compressed_gold", 29, new int[] {3, 8, 6, 3}, 80, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_GOLD_CHESTPLATE = EnumHelper.addArmorMaterial("armor_material_compressed_gold", Reference.MOD_ID + ":compressed_gold", 35, new int[] {3, 8, 6, 3}, 80, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_GOLD_LEGGINGS = EnumHelper.addArmorMaterial("armor_material_compressed_gold", Reference.MOD_ID + ":compressed_gold", 31, new int[] {3, 8, 6, 3}, 80, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_GOLD_BOOTS = EnumHelper.addArmorMaterial("armor_material_compressed_gold", Reference.MOD_ID + ":compressed_gold", 35, new int[] {3, 8, 6, 3}, 80, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0f);
	
	//Diamond Armor Materials
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_DIAMOND_HELMET = EnumHelper.addArmorMaterial("armor_material_compressed_diamond", Reference.MOD_ID + ":compressed_diamond", 139, new int[] {3, 8, 6, 3}, 65, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_DIAMOND_CHESTPLATE = EnumHelper.addArmorMaterial("armor_material_compressed_diamond", Reference.MOD_ID + ":compressed_diamond", 165, new int[] {3, 8, 6, 3}, 65, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_DIAMOND_LEGGINGS = EnumHelper.addArmorMaterial("armor_material_compressed_diamond", Reference.MOD_ID + ":compressed_diamond", 145, new int[] {3, 8, 6, 3}, 65, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	public static final ArmorMaterial ARMOR_MATERIAL_COMPRESSED_DIAMOND_BOOTS = EnumHelper.addArmorMaterial("armor_material_compressed_diamond", Reference.MOD_ID + ":compressed_diamond", 165, new int[] {3, 8, 6, 3}, 65, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0f);
	
	//Tools
	public static final ItemPickaxe COMPRESSED_WOOD_PICKAXE = new ToolPickaxe("compressed_wood_pickaxe", MATERIAL_COMPRESSED_WOOD);
	public static final ItemSpade COMPRESSED_WOOD_SHOVEL = new ToolSpade("compressed_wood_shovel", MATERIAL_COMPRESSED_WOOD);
	public static final ItemSword COMPRESSED_WOOD_SWORD = new ToolSword("compressed_wood_sword", MATERIAL_COMPRESSED_WOOD);
	public static final ItemAxe COMPRESSED_WOOD_AXE = new ToolAxe("compressed_wood_axe", MATERIAL_COMPRESSED_WOOD);
	public static final ItemHoe COMPRESSED_WOOD_HOE = new ToolHoe("compressed_wood_hoe", MATERIAL_COMPRESSED_WOOD);
	
	public static final ItemPickaxe COMPRESSED_IRON_PICKAXE = new ToolPickaxe("compressed_iron_pickaxe", MATERIAL_COMPRESSED_IRON);
	public static final ItemSpade COMPRESSED_IRON_SHOVEL = new ToolSpade("compressed_iron_shovel", MATERIAL_COMPRESSED_IRON);
	public static final ItemSword COMPRESSED_IRON_SWORD = new ToolSword("compressed_iron_sword", MATERIAL_COMPRESSED_IRON);
	public static final ItemAxe COMPRESSED_IRON_AXE = new ToolAxe("compressed_iron_axe", MATERIAL_COMPRESSED_IRON);
	public static final ItemHoe COMPRESSED_IRON_HOE = new ToolHoe("compressed_iron_hoe", MATERIAL_COMPRESSED_IRON);
	
	public static final ItemPickaxe COMPRESSED_GOLD_PICKAXE = new ToolPickaxe("compressed_gold_pickaxe", MATERIAL_COMPRESSED_GOLD);
	public static final ItemSpade COMPRESSED_GOLD_SHOVEL = new ToolSpade("compressed_gold_shovel", MATERIAL_COMPRESSED_GOLD);
	public static final ItemSword COMPRESSED_GOLD_SWORD = new ToolSword("compressed_gold_sword", MATERIAL_COMPRESSED_GOLD);
	public static final ItemAxe COMPRESSED_GOLD_AXE = new ToolAxe("compressed_gold_axe", MATERIAL_COMPRESSED_GOLD);
	public static final ItemHoe COMPRESSED_GOLD_HOE = new ToolHoe("compressed_gold_hoe", MATERIAL_COMPRESSED_GOLD);

	public static final ItemPickaxe COMPRESSED_DIAMOND_PICKAXE = new ToolPickaxe("compressed_diamond_pickaxe", MATERIAL_COMPRESSED_DIAMOND);
	public static final ItemSpade COMPRESSED_DIAMOND_SHOVEL = new ToolSpade("compressed_diamond_shovel", MATERIAL_COMPRESSED_DIAMOND);
	public static final ItemSword COMPRESSED_DIAMOND_SWORD = new ToolSword("compressed_diamond_sword", MATERIAL_COMPRESSED_DIAMOND);
	public static final ItemAxe COMPRESSED_DIAMOND_AXE = new ToolAxe("compressed_diamond_axe", MATERIAL_COMPRESSED_DIAMOND);
	public static final ItemHoe COMPRESSED_DIAMOND_HOE = new ToolHoe("compressed_diamond_hoe", MATERIAL_COMPRESSED_DIAMOND);
	
	//Armor
	public static final Item COMPRESSED_IRON_HELMET = new ArmorBase("compressed_iron_helmet", ARMOR_MATERIAL_COMPRESSED_IRON_HELMET, 1, EntityEquipmentSlot.HEAD);
	public static final Item COMPRESSED_IRON_CHESTPLATE = new ArmorBase("compressed_iron_chestplate", ARMOR_MATERIAL_COMPRESSED_IRON_CHESTPLATE, 1, EntityEquipmentSlot.CHEST);
	public static final Item COMPRESSED_IRON_LEGGINGS = new ArmorBase("compressed_iron_leggings", ARMOR_MATERIAL_COMPRESSED_IRON_LEGGINGS, 2, EntityEquipmentSlot.LEGS);
	public static final Item COMPRESSED_IRON_BOOTS = new ArmorBase("compressed_iron_boots", ARMOR_MATERIAL_COMPRESSED_IRON_BOOTS, 1, EntityEquipmentSlot.FEET);
	
	public static final Item COMPRESSED_GOLD_HELMET = new ArmorBase("compressed_gold_helmet", ARMOR_MATERIAL_COMPRESSED_GOLD_HELMET, 1, EntityEquipmentSlot.HEAD);
	public static final Item COMPRESSED_GOLD_CHESTPLATE = new ArmorBase("compressed_gold_chestplate", ARMOR_MATERIAL_COMPRESSED_GOLD_CHESTPLATE, 1, EntityEquipmentSlot.CHEST);
	public static final Item COMPRESSED_GOLD_LEGGINGS = new ArmorBase("compressed_gold_leggings", ARMOR_MATERIAL_COMPRESSED_GOLD_LEGGINGS, 2, EntityEquipmentSlot.LEGS);
	public static final Item COMPRESSED_GOLD_BOOTS = new ArmorBase("compressed_gold_boots", ARMOR_MATERIAL_COMPRESSED_GOLD_BOOTS, 1, EntityEquipmentSlot.FEET);
	
	public static final Item COMPRESSED_DIAMOND_HELMET = new ArmorBase("compressed_diamond_helmet", ARMOR_MATERIAL_COMPRESSED_DIAMOND_HELMET, 1, EntityEquipmentSlot.HEAD);
	public static final Item COMPRESSED_DIAMOND_CHESTPLATE = new ArmorBase("compressed_diamond_chestplate", ARMOR_MATERIAL_COMPRESSED_DIAMOND_CHESTPLATE, 1, EntityEquipmentSlot.CHEST);
	public static final Item COMPRESSED_DIAMOND_LEGGINGS = new ArmorBase("compressed_diamond_leggings", ARMOR_MATERIAL_COMPRESSED_DIAMOND_LEGGINGS, 2, EntityEquipmentSlot.LEGS);
	public static final Item COMPRESSED_DIAMOND_BOOTS = new ArmorBase("compressed_diamond_boots", ARMOR_MATERIAL_COMPRESSED_DIAMOND_BOOTS, 1, EntityEquipmentSlot.FEET);
	
	
	
}