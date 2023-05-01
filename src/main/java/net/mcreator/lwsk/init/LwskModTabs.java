
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lwsk.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LwskModTabs {
	public static CreativeModeTab TAB_LWSK_ADVENTURES_ITEMS;
	public static CreativeModeTab TAB_LWSK_ADVENTURES_BUILDING;
	public static CreativeModeTab TAB_LWSK_ADVENTURES_MC_BLOCKS;

	public static void load() {
		TAB_LWSK_ADVENTURES_ITEMS = new CreativeModeTab("tablwsk_adventures_items") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LwskModItems.ARSENAL_LOGO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_LWSK_ADVENTURES_BUILDING = new CreativeModeTab("tablwsk_adventures_building") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LwskModBlocks.BLOCKS_LOGO.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_LWSK_ADVENTURES_MC_BLOCKS = new CreativeModeTab("tablwsk_adventures_mc_blocks") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.GRASS_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
