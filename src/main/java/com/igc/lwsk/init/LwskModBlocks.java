
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

import com.igc.lwsk.block.WallLampLitBlock;
import com.igc.lwsk.block.WallLampBrokenBlock;
import com.igc.lwsk.block.VentBlockBlock;
import com.igc.lwsk.block.SublevelWallMiddleBlock;
import com.igc.lwsk.block.SublevelWallBottomBlock;
import com.igc.lwsk.block.PineLogBlock;
import com.igc.lwsk.block.OfficeWallTopCrackedBlock;
import com.igc.lwsk.block.OfficeWallTopBlock;
import com.igc.lwsk.block.OfficeWallStairsBlock;
import com.igc.lwsk.block.OfficeWallMiddleCrackedBlock;
import com.igc.lwsk.block.OfficeWallMiddleBlock;
import com.igc.lwsk.block.OfficeWallMiddle2Block;
import com.igc.lwsk.block.OfficeWallBottomCrackedBlock;
import com.igc.lwsk.block.OfficeWallBottomBlock;
import com.igc.lwsk.block.OfficeWallBlock;
import com.igc.lwsk.block.OfficePCBlock;
import com.igc.lwsk.block.OfficeDoorBlock;
import com.igc.lwsk.block.OfficeDeskBlock;
import com.igc.lwsk.block.OfficeChairBlock;
import com.igc.lwsk.block.LampLitBlock;
import com.igc.lwsk.block.LWSKTallFernTopBlock;
import com.igc.lwsk.block.LWSKTallFernBottomBlock;
import com.igc.lwsk.block.LWSKSweetBerriesBushBlock;
import com.igc.lwsk.block.LWSKStoneStairsBlock;
import com.igc.lwsk.block.LWSKStoneSlabBlock;
import com.igc.lwsk.block.LWSKStoneBlock;
import com.igc.lwsk.block.LWSKSpruceLeavesBlock;
import com.igc.lwsk.block.LWSKGrassBlockBlock;
import com.igc.lwsk.block.LWSKFernBlock;
import com.igc.lwsk.block.LWSKDirtStairsBlock;
import com.igc.lwsk.block.LWSKDirtSlabBlock;
import com.igc.lwsk.block.LWSKDirtBlockBlock;
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
import com.igc.lwsk.block.C4ExplosiveoffBlock;
import com.igc.lwsk.block.C4ExplosiveOnBlock;
import com.igc.lwsk.block.C4ExplosiveHalfBlock;
import com.igc.lwsk.block.BrokenLampBlock;
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
	public static final RegistryObject<Block> LWSK_GRASS_BLOCK = REGISTRY.register("lwsk_grass_block", () -> new LWSKGrassBlockBlock());
	public static final RegistryObject<Block> LWSK_DIRT_BLOCK = REGISTRY.register("lwsk_dirt_block", () -> new LWSKDirtBlockBlock());
	public static final RegistryObject<Block> LWSK_DIRT_STAIRS = REGISTRY.register("lwsk_dirt_stairs", () -> new LWSKDirtStairsBlock());
	public static final RegistryObject<Block> LWSK_DIRT_SLAB = REGISTRY.register("lwsk_dirt_slab", () -> new LWSKDirtSlabBlock());
	public static final RegistryObject<Block> LWSK_STONE = REGISTRY.register("lwsk_stone", () -> new LWSKStoneBlock());
	public static final RegistryObject<Block> LWSK_STONE_STAIRS = REGISTRY.register("lwsk_stone_stairs", () -> new LWSKStoneStairsBlock());
	public static final RegistryObject<Block> LWSK_STONE_SLAB = REGISTRY.register("lwsk_stone_slab", () -> new LWSKStoneSlabBlock());
	public static final RegistryObject<Block> PINE_LOG = REGISTRY.register("pine_log", () -> new PineLogBlock());
	public static final RegistryObject<Block> LWSK_SPRUCE_LEAVES = REGISTRY.register("lwsk_spruce_leaves", () -> new LWSKSpruceLeavesBlock());
	public static final RegistryObject<Block> C_4_EXPLOSIVEOFF = REGISTRY.register("c_4_explosiveoff", () -> new C4ExplosiveoffBlock());
	public static final RegistryObject<Block> C_4_EXPLOSIVE_ON = REGISTRY.register("c_4_explosive_on", () -> new C4ExplosiveOnBlock());
	public static final RegistryObject<Block> C_4_EXPLOSIVE_HALF = REGISTRY.register("c_4_explosive_half", () -> new C4ExplosiveHalfBlock());
	public static final RegistryObject<Block> LWSK_FERN = REGISTRY.register("lwsk_fern", () -> new LWSKFernBlock());
	public static final RegistryObject<Block> LWSK_TALL_FERN_BOTTOM = REGISTRY.register("lwsk_tall_fern_bottom", () -> new LWSKTallFernBottomBlock());
	public static final RegistryObject<Block> LWSK_TALL_FERN_TOP = REGISTRY.register("lwsk_tall_fern_top", () -> new LWSKTallFernTopBlock());
	public static final RegistryObject<Block> LWSK_SWEET_BERRIES_BUSH = REGISTRY.register("lwsk_sweet_berries_bush", () -> new LWSKSweetBerriesBushBlock());
	public static final RegistryObject<Block> OFFICE_DOOR = REGISTRY.register("office_door", () -> new OfficeDoorBlock());
	public static final RegistryObject<Block> LAMP_LIT = REGISTRY.register("lamp_lit", () -> new LampLitBlock());
	public static final RegistryObject<Block> BROKEN_LAMP = REGISTRY.register("broken_lamp", () -> new BrokenLampBlock());
	public static final RegistryObject<Block> OFFICE_DESK = REGISTRY.register("office_desk", () -> new OfficeDeskBlock());
	public static final RegistryObject<Block> OFFICE_CHAIR = REGISTRY.register("office_chair", () -> new OfficeChairBlock());
	public static final RegistryObject<Block> OFFICE_PC = REGISTRY.register("office_pc", () -> new OfficePCBlock());
	public static final RegistryObject<Block> WALL_LAMP_LIT = REGISTRY.register("wall_lamp_lit", () -> new WallLampLitBlock());
	public static final RegistryObject<Block> WALL_LAMP_BROKEN = REGISTRY.register("wall_lamp_broken", () -> new WallLampBrokenBlock());
	public static final RegistryObject<Block> VENT_BLOCK = REGISTRY.register("vent_block", () -> new VentBlockBlock());
	public static final RegistryObject<Block> OFFICE_WALL_STAIRS = REGISTRY.register("office_wall_stairs", () -> new OfficeWallStairsBlock());
	public static final RegistryObject<Block> OFFICE_WALL = REGISTRY.register("office_wall", () -> new OfficeWallBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BlocksLogoBlock.registerRenderLayer();
			FloorDBlock.registerRenderLayer();
			FloorDStairsBlock.registerRenderLayer();
			FloorDSlabBlock.registerRenderLayer();
			LWSKSpruceLeavesBlock.registerRenderLayer();
			C4ExplosiveoffBlock.registerRenderLayer();
			C4ExplosiveOnBlock.registerRenderLayer();
			C4ExplosiveHalfBlock.registerRenderLayer();
			LWSKFernBlock.registerRenderLayer();
			LWSKTallFernBottomBlock.registerRenderLayer();
			LWSKTallFernTopBlock.registerRenderLayer();
			LWSKSweetBerriesBushBlock.registerRenderLayer();
			OfficeDoorBlock.registerRenderLayer();
			LampLitBlock.registerRenderLayer();
			BrokenLampBlock.registerRenderLayer();
			OfficeChairBlock.registerRenderLayer();
			OfficePCBlock.registerRenderLayer();
			WallLampLitBlock.registerRenderLayer();
			WallLampBrokenBlock.registerRenderLayer();
			OfficeWallBlock.registerRenderLayer();
		}
	}
}
