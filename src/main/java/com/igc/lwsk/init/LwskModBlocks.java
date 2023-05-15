
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.igc.lwsk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import com.igc.lwsk.block.SublevelWallMiddleBlock;
import com.igc.lwsk.block.SublevelWallBottomBlock;
import com.igc.lwsk.block.OfficeWallTopCrackedBlock;
import com.igc.lwsk.block.OfficeWallTopBlock;
import com.igc.lwsk.block.OfficeWallMiddleCrackedBlock;
import com.igc.lwsk.block.OfficeWallMiddleBlock;
import com.igc.lwsk.block.OfficeWallMiddle2Block;
import com.igc.lwsk.block.OfficeWallBottomCrackedBlock;
import com.igc.lwsk.block.OfficeWallBottomBlock;
import com.igc.lwsk.block.FloorDStairsBlock;
import com.igc.lwsk.block.FloorDSlabBlock;
import com.igc.lwsk.block.FloorDBlock;
import com.igc.lwsk.block.FloorCStairsBlock;
import com.igc.lwsk.block.FloorCSlabBlock;
import com.igc.lwsk.block.FloorCBlock;
import com.igc.lwsk.block.FloorBStairsBlock;
import com.igc.lwsk.block.FloorBSlabBlock;
import com.igc.lwsk.block.FloorBBlock;
import com.igc.lwsk.block.FloorAStairsBlock;
import com.igc.lwsk.block.FloorASlabBlock;
import com.igc.lwsk.block.FloorABlock;
import com.igc.lwsk.block.BlocksLogoBlock;
import com.igc.lwsk.LwskMod;

public class LwskModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LwskMod.MODID);
	public static final RegistryObject<Block> FLOOR_A = REGISTRY.register("floor_a", () -> new FloorABlock());
	public static final RegistryObject<Block> FLOOR_A_STAIRS = REGISTRY.register("floor_a_stairs", () -> new FloorAStairsBlock());
	public static final RegistryObject<Block> FLOOR_A_SLAB = REGISTRY.register("floor_a_slab", () -> new FloorASlabBlock());
	public static final RegistryObject<Block> BLOCKS_LOGO = REGISTRY.register("blocks_logo", () -> new BlocksLogoBlock());
	public static final RegistryObject<Block> FLOOR_B = REGISTRY.register("floor_b", () -> new FloorBBlock());
	public static final RegistryObject<Block> FLOOR_B_STAIRS = REGISTRY.register("floor_b_stairs", () -> new FloorBStairsBlock());
	public static final RegistryObject<Block> FLOOR_B_SLAB = REGISTRY.register("floor_b_slab", () -> new FloorBSlabBlock());
	public static final RegistryObject<Block> FLOOR_C = REGISTRY.register("floor_c", () -> new FloorCBlock());
	public static final RegistryObject<Block> FLOOR_C_STAIRS = REGISTRY.register("floor_c_stairs", () -> new FloorCStairsBlock());
	public static final RegistryObject<Block> FLOOR_C_SLAB = REGISTRY.register("floor_c_slab", () -> new FloorCSlabBlock());
	public static final RegistryObject<Block> FLOOR_D = REGISTRY.register("floor_d", () -> new FloorDBlock());
	public static final RegistryObject<Block> FLOOR_D_STAIRS = REGISTRY.register("floor_d_stairs", () -> new FloorDStairsBlock());
	public static final RegistryObject<Block> FLOOR_D_SLAB = REGISTRY.register("floor_d_slab", () -> new FloorDSlabBlock());
	public static final RegistryObject<Block> OFFICE_WALL_BOTTOM = REGISTRY.register("office_wall_bottom", () -> new OfficeWallBottomBlock());
	public static final RegistryObject<Block> OFFICE_WALL_BOTTOM_CRACKED = REGISTRY.register("office_wall_bottom_cracked", () -> new OfficeWallBottomCrackedBlock());
	public static final RegistryObject<Block> OFFICE_WALL_MIDDLE = REGISTRY.register("office_wall_middle", () -> new OfficeWallMiddleBlock());
	public static final RegistryObject<Block> OFFICE_WALL_MIDDLE_CRACKED = REGISTRY.register("office_wall_middle_cracked", () -> new OfficeWallMiddleCrackedBlock());
	public static final RegistryObject<Block> OFFICE_WALL_MIDDLE_2 = REGISTRY.register("office_wall_middle_2", () -> new OfficeWallMiddle2Block());
	public static final RegistryObject<Block> OFFICE_WALL_TOP = REGISTRY.register("office_wall_top", () -> new OfficeWallTopBlock());
	public static final RegistryObject<Block> OFFICE_WALL_TOP_CRACKED = REGISTRY.register("office_wall_top_cracked", () -> new OfficeWallTopCrackedBlock());
	public static final RegistryObject<Block> SUBLEVEL_WALL_BOTTOM = REGISTRY.register("sublevel_wall_bottom", () -> new SublevelWallBottomBlock());
	public static final RegistryObject<Block> SUBLEVEL_WALL_MIDDLE = REGISTRY.register("sublevel_wall_middle", () -> new SublevelWallMiddleBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BlocksLogoBlock.registerRenderLayer();
			FloorDBlock.registerRenderLayer();
			FloorDStairsBlock.registerRenderLayer();
			FloorDSlabBlock.registerRenderLayer();
		}
	}
}
