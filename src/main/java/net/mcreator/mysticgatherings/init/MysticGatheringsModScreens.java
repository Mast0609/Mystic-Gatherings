/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.mysticgatherings.client.gui.Tier2RitualCircleGUIScreen;
import net.mcreator.mysticgatherings.client.gui.Tier1RitualCircleGUIScreen;
import net.mcreator.mysticgatherings.client.gui.LeatherSackInventoryScreen;

@EventBusSubscriber(Dist.CLIENT)
public class MysticGatheringsModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MysticGatheringsModMenus.TIER_1_RITUAL_CIRCLE_GUI.get(), Tier1RitualCircleGUIScreen::new);
		event.register(MysticGatheringsModMenus.LEATHER_SACK_INVENTORY.get(), LeatherSackInventoryScreen::new);
		event.register(MysticGatheringsModMenus.TIER_2_RITUAL_CIRCLE_GUI.get(), Tier2RitualCircleGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}