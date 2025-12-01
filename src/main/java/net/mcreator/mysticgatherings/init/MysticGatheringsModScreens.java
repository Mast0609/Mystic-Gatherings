/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.mysticgatherings.client.gui.Tier1RitualCircleGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class MysticGatheringsModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MysticGatheringsModMenus.TIER_1_RITUAL_CIRCLE_GUI.get(), Tier1RitualCircleGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}