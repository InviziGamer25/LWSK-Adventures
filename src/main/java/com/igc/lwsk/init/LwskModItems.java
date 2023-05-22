
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.igc.lwsk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.igc.lwsk.item.LWSKShearsRedItem;
import com.igc.lwsk.item.LWSKShearsBlueItem;
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
	public static final RegistryObject<Item> LWSK_STONE_STAIRS = block(LwskModBlocks.LWSK_STONE_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_STONE_SLAB = block(LwskModBlocks.LWSK_STONE_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> PINE_LOG = block(LwskModBlocks.PINE_LOG, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_SPRUCE_LEAVES = block(LwskModBlocks.LWSK_SPRUCE_LEAVES, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> C_4_EXPLOSIVEOFF = block(LwskModBlocks.C_4_EXPLOSIVEOFF, LwskModTabs.TAB_LWSK_ADVENTURES_ITEMS);
	public static final RegistryObject<Item> C_4_EXPLOSIVE_ON = block(LwskModBlocks.C_4_EXPLOSIVE_ON, null);
	public static final RegistryObject<Item> C_4_EXPLOSIVE_HALF = block(LwskModBlocks.C_4_EXPLOSIVE_HALF, null);
	public static final RegistryObject<Item> LWSK_SHEARS_RED = REGISTRY.register("lwsk_shears_red", () -> new LWSKShearsRedItem());
	public static final RegistryObject<Item> LWSK_SHEARS_BLUE = REGISTRY.register("lwsk_shears_blue", () -> new LWSKShearsBlueItem());
	public static final RegistryObject<Item> LWSK_FERN = block(LwskModBlocks.LWSK_FERN, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_TALL_FERN_BOTTOM = block(LwskModBlocks.LWSK_TALL_FERN_BOTTOM, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_TALL_FERN_TOP = block(LwskModBlocks.LWSK_TALL_FERN_TOP, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_SWEET_BERRIES_BUSH = block(LwskModBlocks.LWSK_SWEET_BERRIES_BUSH, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> OFFICE_DOOR = doubleBlock(LwskModBlocks.OFFICE_DOOR, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> LAMP_LIT = block(LwskModBlocks.LAMP_LIT, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> BROKEN_LAMP = block(LwskModBlocks.BROKEN_LAMP, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_DESK = block(LwskModBlocks.OFFICE_DESK, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_CHAIR = block(LwskModBlocks.OFFICE_CHAIR, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_PC = block(LwskModBlocks.OFFICE_PC, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
