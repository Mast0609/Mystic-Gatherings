/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import org.lwjgl.glfw.GLFW;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.mysticgatherings.network.SwitchToStoredMystiaMessage;
import net.mcreator.mysticgatherings.network.SwitchMystiaBarOrientationMessage;

@EventBusSubscriber(Dist.CLIENT)
public class MysticGatheringsModKeyMappings {
	public static final KeyMapping SWITCH_TO_STORED_MYSTIA = new KeyMapping("key.mystic_gatherings.switch_to_stored_mystia", GLFW.GLFW_KEY_KP_0, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new SwitchToStoredMystiaMessage(0, 0));
				SwitchToStoredMystiaMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SWITCH_MYSTIA_BAR_ORIENTATION = new KeyMapping("key.mystic_gatherings.switch_mystia_bar_orientation", GLFW.GLFW_KEY_KP_ENTER, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				ClientPacketDistributor.sendToServer(new SwitchMystiaBarOrientationMessage(0, 0));
				SwitchMystiaBarOrientationMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SWITCH_TO_STORED_MYSTIA);
		event.register(SWITCH_MYSTIA_BAR_ORIENTATION);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(ClientTickEvent.Post event) {
			if (Minecraft.getInstance().screen == null) {
				SWITCH_TO_STORED_MYSTIA.consumeClick();
				SWITCH_MYSTIA_BAR_ORIENTATION.consumeClick();
			}
		}
	}
}