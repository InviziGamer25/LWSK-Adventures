
package net.mcreator.lwsk.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.lwsk.init.LwskModTabs;

public class SecurityKeycardItem extends Item {
	public SecurityKeycardItem() {
		super(new Item.Properties().tab(LwskModTabs.TAB_LWSK_ADVENTURES_ITEMS).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}
}
