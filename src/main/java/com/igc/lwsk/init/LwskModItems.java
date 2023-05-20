
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.igc.lwsk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.igc.lwsk.item.ArsenalLogoItem;
import com.igc.lwsk.LwskMod;

public class LwskModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LwskMod.MODID);
	public static final RegistryObject<Item> FLOOR_A = block(LwskModBlocks.FLOOR_A, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_A_STAIRS = block(LwskModBlocks.FLOOR_A_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_A_SLAB = block(LwskModBlocks.FLOOR_A_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> ARSENAL_LOGO = REGISTRY.register("arsenal_logo", () -> new ArsenalLogoItem());
	public static final RegistryObject<Item> BLOCKS_LOGO = block(LwskModBlocks.BLOCKS_LOGO, null);
	public static final RegistryObject<Item> FLOOR_B = block(LwskModBlocks.FLOOR_B, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_B_STAIRS = block(LwskModBlocks.FLOOR_B_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_B_SLAB = block(LwskModBlocks.FLOOR_B_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_C = block(LwskModBlocks.FLOOR_C, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_C_STAIRS = block(LwskModBlocks.FLOOR_C_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_C_SLAB = block(LwskModBlocks.FLOOR_C_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_D = block(LwskModBlocks.FLOOR_D, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_D_STAIRS = block(LwskModBlocks.FLOOR_D_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_D_SLAB = block(LwskModBlocks.FLOOR_D_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_WALL_BOTTOM = block(LwskModBlocks.OFFICE_WALL_BOTTOM, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_WALL_BOTTOM_CRACKED = block(LwskModBlocks.OFFICE_WALL_BOTTOM_CRACKED, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_WALL_MIDDLE = block(LwskModBlocks.OFFICE_WALL_MIDDLE, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_WALL_MIDDLE_CRACKED = block(LwskModBlocks.OFFICE_WALL_MIDDLE_CRACKED, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_WALL_MIDDLE_2 = block(LwskModBlocks.OFFICE_WALL_MIDDLE_2, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_WALL_TOP = block(LwskModBlocks.OFFICE_WALL_TOP, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_WALL_TOP_CRACKED = block(LwskModBlocks.OFFICE_WALL_TOP_CRACKED, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> SUBLEVEL_WALL_BOTTOM = block(LwskModBlocks.SUBLEVEL_WALL_BOTTOM, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> SUBLEVEL_WALL_MIDDLE = block(LwskModBlocks.SUBLEVEL_WALL_MIDDLE, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> LWSK_GRASS_BLOCK = block(LwskModBlocks.LWSK_GRASS_BLOCK, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_DIRT_BLOCK = block(LwskModBlocks.LWSK_DIRT_BLOCK, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_DIRT_STAIRS = block(LwskModBlocks.LWSK_DIRT_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_DIRT_SLAB = block(LwskModBlocks.LWSK_DIRT_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_STONE = block(LwskModBlocks.LWSK_STONE, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
