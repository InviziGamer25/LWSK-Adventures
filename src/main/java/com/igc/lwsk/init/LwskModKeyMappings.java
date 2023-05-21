
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.igc.lwsk.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import com.igc.lwsk.network.CKeybindingMessage;
import com.igc.lwsk.LwskMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class LwskModKeyMappings {
	public static final KeyMapping C_KEYBINDING = new KeyMapping("key.lwsk.c_keybinding", GLFW.GLFW_KEY_C, "key.categories.lwsk");
	private static long C_KEYBINDING_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(C_KEYBINDING);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == C_KEYBINDING.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						C_KEYBINDING_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - C_KEYBINDING_LASTPRESS);
						LwskMod.PACKET_HANDLER.sendToServer(new CKeybindingMessage(1, dt));
						CKeybindingMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
			}
		}
	}
}
