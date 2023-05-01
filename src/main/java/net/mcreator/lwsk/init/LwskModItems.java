
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lwsk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lwsk.item.SpecialKnifeItem;
import net.mcreator.lwsk.item.SecurityKeycardItem;
import net.mcreator.lwsk.item.ManagerKeycardItem;
import net.mcreator.lwsk.item.KnifeItem;
import net.mcreator.lwsk.item.JanitorKeycardItem;
import net.mcreator.lwsk.item.ArsenalLogoItem;
import net.mcreator.lwsk.item.AdvancedKnifeItem;
import net.mcreator.lwsk.LwskMod;

public class LwskModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LwskMod.MODID);
	public static final RegistryObject<Item> FLOOR_A = block(LwskModBlocks.FLOOR_A, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_A_STAIRS = block(LwskModBlocks.FLOOR_A_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_A_SLAB = block(LwskModBlocks.FLOOR_A_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_B = block(LwskModBlocks.FLOOR_B, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_B_STAIRS = block(LwskModBlocks.FLOOR_B_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_B_SLAB = block(LwskModBlocks.FLOOR_B_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_C = block(LwskModBlocks.FLOOR_C, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_C_STAIRS = block(LwskModBlocks.FLOOR_C_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_C_SLAB = block(LwskModBlocks.FLOOR_C_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_D = block(LwskModBlocks.FLOOR_D, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_D_STAIRS = block(LwskModBlocks.FLOOR_D_STAIRS, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> FLOOR_D_SLAB = block(LwskModBlocks.FLOOR_D_SLAB, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_BOOTOM = block(LwskModBlocks.WALL_A_BOOTOM, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_MIDDLE_S_1 = block(LwskModBlocks.WALL_A_MIDDLE_S_1, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_MIDDLE_S_2 = block(LwskModBlocks.WALL_A_MIDDLE_S_2, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_MIDDLE_S_3 = block(LwskModBlocks.WALL_A_MIDDLE_S_3, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_TOP = block(LwskModBlocks.WALL_A_TOP, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_DOOR = doubleBlock(LwskModBlocks.OFFICE_DOOR, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_DOOR_BOTTOM = block(LwskModBlocks.WALL_A_DOOR_BOTTOM, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_DOOR_MIDDLE_S_1 = block(LwskModBlocks.WALL_A_DOOR_MIDDLE_S_1, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_DOOR_MIDDLE_S_2 = block(LwskModBlocks.WALL_A_DOOR_MIDDLE_S_2, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_DOOR_MIDDLE_S_3 = block(LwskModBlocks.WALL_A_DOOR_MIDDLE_S_3, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_DOOR_TOP = block(LwskModBlocks.WALL_A_DOOR_TOP, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_B_BOTTOM = block(LwskModBlocks.WALL_B_BOTTOM, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_B_MIDDLE_S_1 = block(LwskModBlocks.WALL_B_MIDDLE_S_1, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_B_DOOR_BOTTOM = block(LwskModBlocks.WALL_B_DOOR_BOTTOM, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_B_DOOR_MIDDLE_S_1 = block(LwskModBlocks.WALL_B_DOOR_MIDDLE_S_1, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> LAMP = block(LwskModBlocks.LAMP, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> BROKEN_LAMP = block(LwskModBlocks.BROKEN_LAMP, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_BOTTOM_CRACKED = block(LwskModBlocks.WALL_A_BOTTOM_CRACKED, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_MIDDLE_S_2_CRACKED = block(LwskModBlocks.WALL_A_MIDDLE_S_2_CRACKED, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> WALL_A_TOP_CRACKED = block(LwskModBlocks.WALL_A_TOP_CRACKED, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_TABLE = block(LwskModBlocks.OFFICE_TABLE, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> OFFICE_CHAIR = block(LwskModBlocks.OFFICE_CHAIR, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> PINE_TREE_LOG = block(LwskModBlocks.PINE_TREE_LOG, LwskModTabs.TAB_LWSK_ADVENTURES_BUILDING);
	public static final RegistryObject<Item> LWSK_OFFICE_GLASS = block(LwskModBlocks.LWSK_OFFICE_GLASS, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_GRASS_BLOCK = block(LwskModBlocks.LWSK_GRASS_BLOCK, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_DIRT = block(LwskModBlocks.LWSK_DIRT, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_STONE = block(LwskModBlocks.LWSK_STONE, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_FERN = block(LwskModBlocks.LWSK_FERN, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_TALL_FERN_BOTTOM = block(LwskModBlocks.LWSK_TALL_FERN_BOTTOM, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_TALL_FERN_TOP = block(LwskModBlocks.LWSK_TALL_FERN_TOP, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_SWEET_BERRIES_BUSH = block(LwskModBlocks.LWSK_SWEET_BERRIES_BUSH, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> LWSK_SPRUCE_LEAVES = block(LwskModBlocks.LWSK_SPRUCE_LEAVES, LwskModTabs.TAB_LWSK_ADVENTURES_MC_BLOCKS);
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> ADVANCED_KNIFE = REGISTRY.register("advanced_knife", () -> new AdvancedKnifeItem());
	public static final RegistryObject<Item> SPECIAL_KNIFE = REGISTRY.register("special_knife", () -> new SpecialKnifeItem());
	public static final RegistryObject<Item> JANITOR_KEYCARD = REGISTRY.register("janitor_keycard", () -> new JanitorKeycardItem());
	public static final RegistryObject<Item> SECURITY_KEYCARD = REGISTRY.register("security_keycard", () -> new SecurityKeycardItem());
	public static final RegistryObject<Item> MANAGER_KEYCARD = REGISTRY.register("manager_keycard", () -> new ManagerKeycardItem());
	public static final RegistryObject<Item> C_4_EXPLOSIVE = block(LwskModBlocks.C_4_EXPLOSIVE, LwskModTabs.TAB_LWSK_ADVENTURES_ITEMS);
	public static final RegistryObject<Item> C_4_EXPLOSIVE_ACTIVATED = block(LwskModBlocks.C_4_EXPLOSIVE_ACTIVATED, LwskModTabs.TAB_LWSK_ADVENTURES_ITEMS);
	public static final RegistryObject<Item> ARSENAL_LOGO = REGISTRY.register("arsenal_logo", () -> new ArsenalLogoItem());
	public static final RegistryObject<Item> BLOCKS_LOGO = block(LwskModBlocks.BLOCKS_LOGO, null);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
