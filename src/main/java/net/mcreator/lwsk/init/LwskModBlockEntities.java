
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lwsk.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.lwsk.block.entity.OfficeTableBlockEntity;
import net.mcreator.lwsk.LwskMod;

public class LwskModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, LwskMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> OFFICE_TABLE = register("office_table", LwskModBlocks.OFFICE_TABLE, OfficeTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
