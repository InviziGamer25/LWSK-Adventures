
package com.igc.lwsk.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.igc.lwsk.init.LwskModTabs;

public class ManagerKeycardItem extends Item {
	public ManagerKeycardItem() {
		super(new Item.Properties().tab(LwskModTabs.TAB_LWSK_ADVENTURES_ITEMS).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
	}
}
