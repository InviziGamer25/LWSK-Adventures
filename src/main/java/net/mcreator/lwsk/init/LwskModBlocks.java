
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lwsk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.lwsk.block.WallBMiddleS1Block;
import net.mcreator.lwsk.block.WallBDoorMiddleS1Block;
import net.mcreator.lwsk.block.WallBDoorBottomBlock;
import net.mcreator.lwsk.block.WallBBottomBlock;
import net.mcreator.lwsk.block.WallATopCrackedBlock;
import net.mcreator.lwsk.block.WallATopBlock;
import net.mcreator.lwsk.block.WallAMiddleS3Block;
import net.mcreator.lwsk.block.WallAMiddleS2Block;
import net.mcreator.lwsk.block.WallAMiddleS1CrackedBlock;
import net.mcreator.lwsk.block.WallAMiddleS1Block;
import net.mcreator.lwsk.block.WallADoorTopBlock;
import net.mcreator.lwsk.block.WallADoorMiddleS3Block;
import net.mcreator.lwsk.block.WallADoorMiddleS2Block;
import net.mcreator.lwsk.block.WallADoorMiddleS1Block;
import net.mcreator.lwsk.block.WallADoorBottomBlock;
import net.mcreator.lwsk.block.WallABottomCrackedBlock;
import net.mcreator.lwsk.block.WallABootomBlock;
import net.mcreator.lwsk.block.PineTreeLogBlock;
import net.mcreator.lwsk.block.OfficeTableBlock;
import net.mcreator.lwsk.block.OfficeDoorBlock;
import net.mcreator.lwsk.block.OfficeChairBlock;
import net.mcreator.lwsk.block.LampBlock;
import net.mcreator.lwsk.block.LWSKTallFernTopBlock;
import net.mcreator.lwsk.block.LWSKTallFernBlock;
import net.mcreator.lwsk.block.LWSKSweetBerriesBushBlock;
import net.mcreator.lwsk.block.LWSKStoneBlock;
import net.mcreator.lwsk.block.LWSKSpruceLeavesBlock;
import net.mcreator.lwsk.block.LWSKOfficeGlassBlock;
import net.mcreator.lwsk.block.LWSKGrassBlockBlock;
import net.mcreator.lwsk.block.LWSKFernBlock;
import net.mcreator.lwsk.block.LWSKDirtBlock;
import net.mcreator.lwsk.block.FloorDStairsBlock;
import net.mcreator.lwsk.block.FloorDSlabBlock;
import net.mcreator.lwsk.block.FloorDBlock;
import net.mcreator.lwsk.block.FloorCStairBlock;
import net.mcreator.lwsk.block.FloorCSlabBlock;
import net.mcreator.lwsk.block.FloorCBlock;
import net.mcreator.lwsk.block.FloorBStairsBlock;
import net.mcreator.lwsk.block.FloorBSlabBlock;
import net.mcreator.lwsk.block.FloorBBlock;
import net.mcreator.lwsk.block.FloorAStairsBlock;
import net.mcreator.lwsk.block.FloorASlabBlock;
import net.mcreator.lwsk.block.FloorABlock;
import net.mcreator.lwsk.block.C4ExplosiveBlock;
import net.mcreator.lwsk.block.C4ExplosiveActivatedBlock;
import net.mcreator.lwsk.block.BrokenLampBlock;
import net.mcreator.lwsk.block.BlocksLogoBlock;
import net.mcreator.lwsk.LwskMod;

public class LwskModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LwskMod.MODID);
	public static final RegistryObject<Block> FLOOR_A = REGISTRY.register("floor_a", () -> new FloorABlock());
	public static final RegistryObject<Block> FLOOR_A_STAIRS = REGISTRY.register("floor_a_stairs", () -> new FloorAStairsBlock());
	public static final RegistryObject<Block> FLOOR_A_SLAB = REGISTRY.register("floor_a_slab", () -> new FloorASlabBlock());
	public static final RegistryObject<Block> FLOOR_B = REGISTRY.register("floor_b", () -> new FloorBBlock());
	public static final RegistryObject<Block> FLOOR_B_STAIRS = REGISTRY.register("floor_b_stairs", () -> new FloorBStairsBlock());
	public static final RegistryObject<Block> FLOOR_B_SLAB = REGISTRY.register("floor_b_slab", () -> new FloorBSlabBlock());
	public static final RegistryObject<Block> FLOOR_C = REGISTRY.register("floor_c", () -> new FloorCBlock());
	public static final RegistryObject<Block> FLOOR_C_STAIRS = REGISTRY.register("floor_c_stairs", () -> new FloorCStairBlock());
	public static final RegistryObject<Block> FLOOR_C_SLAB = REGISTRY.register("floor_c_slab", () -> new FloorCSlabBlock());
	public static final RegistryObject<Block> FLOOR_D = REGISTRY.register("floor_d", () -> new FloorDBlock());
	public static final RegistryObject<Block> FLOOR_D_STAIRS = REGISTRY.register("floor_d_stairs", () -> new FloorDStairsBlock());
	public static final RegistryObject<Block> FLOOR_D_SLAB = REGISTRY.register("floor_d_slab", () -> new FloorDSlabBlock());
	public static final RegistryObject<Block> WALL_A_BOOTOM = REGISTRY.register("wall_a_bootom", () -> new WallABootomBlock());
	public static final RegistryObject<Block> WALL_A_MIDDLE_S_1 = REGISTRY.register("wall_a_middle_s_1", () -> new WallAMiddleS1Block());
	public static final RegistryObject<Block> WALL_A_MIDDLE_S_2 = REGISTRY.register("wall_a_middle_s_2", () -> new WallAMiddleS2Block());
	public static final RegistryObject<Block> WALL_A_MIDDLE_S_3 = REGISTRY.register("wall_a_middle_s_3", () -> new WallAMiddleS3Block());
	public static final RegistryObject<Block> WALL_A_TOP = REGISTRY.register("wall_a_top", () -> new WallATopBlock());
	public static final RegistryObject<Block> OFFICE_DOOR = REGISTRY.register("office_door", () -> new OfficeDoorBlock());
	public static final RegistryObject<Block> WALL_A_DOOR_BOTTOM = REGISTRY.register("wall_a_door_bottom", () -> new WallADoorBottomBlock());
	public static final RegistryObject<Block> WALL_A_DOOR_MIDDLE_S_1 = REGISTRY.register("wall_a_door_middle_s_1", () -> new WallADoorMiddleS1Block());
	public static final RegistryObject<Block> WALL_A_DOOR_MIDDLE_S_2 = REGISTRY.register("wall_a_door_middle_s_2", () -> new WallADoorMiddleS2Block());
	public static final RegistryObject<Block> WALL_A_DOOR_MIDDLE_S_3 = REGISTRY.register("wall_a_door_middle_s_3", () -> new WallADoorMiddleS3Block());
	public static final RegistryObject<Block> WALL_A_DOOR_TOP = REGISTRY.register("wall_a_door_top", () -> new WallADoorTopBlock());
	public static final RegistryObject<Block> WALL_B_BOTTOM = REGISTRY.register("wall_b_bottom", () -> new WallBBottomBlock());
	public static final RegistryObject<Block> WALL_B_MIDDLE_S_1 = REGISTRY.register("wall_b_middle_s_1", () -> new WallBMiddleS1Block());
	public static final RegistryObject<Block> WALL_B_DOOR_BOTTOM = REGISTRY.register("wall_b_door_bottom", () -> new WallBDoorBottomBlock());
	public static final RegistryObject<Block> WALL_B_DOOR_MIDDLE_S_1 = REGISTRY.register("wall_b_door_middle_s_1", () -> new WallBDoorMiddleS1Block());
	public static final RegistryObject<Block> LAMP = REGISTRY.register("lamp", () -> new LampBlock());
	public static final RegistryObject<Block> BROKEN_LAMP = REGISTRY.register("broken_lamp", () -> new BrokenLampBlock());
	public static final RegistryObject<Block> WALL_A_BOTTOM_CRACKED = REGISTRY.register("wall_a_bottom_cracked", () -> new WallABottomCrackedBlock());
	public static final RegistryObject<Block> WALL_A_MIDDLE_S_2_CRACKED = REGISTRY.register("wall_a_middle_s_2_cracked", () -> new WallAMiddleS1CrackedBlock());
	public static final RegistryObject<Block> WALL_A_TOP_CRACKED = REGISTRY.register("wall_a_top_cracked", () -> new WallATopCrackedBlock());
	public static final RegistryObject<Block> OFFICE_TABLE = REGISTRY.register("office_table", () -> new OfficeTableBlock());
	public static final RegistryObject<Block> OFFICE_CHAIR = REGISTRY.register("office_chair", () -> new OfficeChairBlock());
	public static final RegistryObject<Block> PINE_TREE_LOG = REGISTRY.register("pine_tree_log", () -> new PineTreeLogBlock());
	public static final RegistryObject<Block> LWSK_OFFICE_GLASS = REGISTRY.register("lwsk_office_glass", () -> new LWSKOfficeGlassBlock());
	public static final RegistryObject<Block> LWSK_GRASS_BLOCK = REGISTRY.register("lwsk_grass_block", () -> new LWSKGrassBlockBlock());
	public static final RegistryObject<Block> LWSK_DIRT = REGISTRY.register("lwsk_dirt", () -> new LWSKDirtBlock());
	public static final RegistryObject<Block> LWSK_STONE = REGISTRY.register("lwsk_stone", () -> new LWSKStoneBlock());
	public static final RegistryObject<Block> LWSK_FERN = REGISTRY.register("lwsk_fern", () -> new LWSKFernBlock());
	public static final RegistryObject<Block> LWSK_TALL_FERN_BOTTOM = REGISTRY.register("lwsk_tall_fern_bottom", () -> new LWSKTallFernBlock());
	public static final RegistryObject<Block> LWSK_TALL_FERN_TOP = REGISTRY.register("lwsk_tall_fern_top", () -> new LWSKTallFernTopBlock());
	public static final RegistryObject<Block> LWSK_SWEET_BERRIES_BUSH = REGISTRY.register("lwsk_sweet_berries_bush", () -> new LWSKSweetBerriesBushBlock());
	public static final RegistryObject<Block> LWSK_SPRUCE_LEAVES = REGISTRY.register("lwsk_spruce_leaves", () -> new LWSKSpruceLeavesBlock());
	public static final RegistryObject<Block> C_4_EXPLOSIVE = REGISTRY.register("c_4_explosive", () -> new C4ExplosiveBlock());
	public static final RegistryObject<Block> C_4_EXPLOSIVE_ACTIVATED = REGISTRY.register("c_4_explosive_activated", () -> new C4ExplosiveActivatedBlock());
	public static final RegistryObject<Block> BLOCKS_LOGO = REGISTRY.register("blocks_logo", () -> new BlocksLogoBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			FloorDBlock.registerRenderLayer();
			FloorDStairsBlock.registerRenderLayer();
			FloorDSlabBlock.registerRenderLayer();
			OfficeDoorBlock.registerRenderLayer();
			LampBlock.registerRenderLayer();
			BrokenLampBlock.registerRenderLayer();
			OfficeTableBlock.registerRenderLayer();
			OfficeChairBlock.registerRenderLayer();
			LWSKOfficeGlassBlock.registerRenderLayer();
			LWSKFernBlock.registerRenderLayer();
			LWSKTallFernBlock.registerRenderLayer();
			LWSKTallFernTopBlock.registerRenderLayer();
			LWSKSweetBerriesBushBlock.registerRenderLayer();
			LWSKSpruceLeavesBlock.registerRenderLayer();
			C4ExplosiveBlock.registerRenderLayer();
			C4ExplosiveActivatedBlock.registerRenderLayer();
			BlocksLogoBlock.registerRenderLayer();
		}
	}
}
