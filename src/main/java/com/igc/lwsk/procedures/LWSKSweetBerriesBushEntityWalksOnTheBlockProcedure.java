package com.igc.lwsk.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class LWSKSweetBerriesBushEntityWalksOnTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.SWEET_BERRY_BUSH, 1);
	}
}
