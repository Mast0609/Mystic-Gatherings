/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.mysticgatherings.client.model.ModelSmallBellhop;
import net.mcreator.mysticgatherings.client.model.ModelMediumBellhop;

@EventBusSubscriber(Dist.CLIENT)
public class MysticGatheringsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelMediumBellhop.LAYER_LOCATION, ModelMediumBellhop::createBodyLayer);
		event.registerLayerDefinition(ModelSmallBellhop.LAYER_LOCATION, ModelSmallBellhop::createBodyLayer);
	}
}