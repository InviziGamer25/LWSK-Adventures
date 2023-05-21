
package com.igc.lwsk.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import java.util.List;

import com.igc.lwsk.init.LwskModTabs;

public class LWSKShearsBlueItem extends Item {
	public LWSKShearsBlueItem() {
		super(new Item.Properties().tab(LwskModTabs.TAB_LWSK_ADVENTURES_ITEMS).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("Cut the Blue Wire"));
	}
}
