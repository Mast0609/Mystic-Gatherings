/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.mysticgatherings.client.renderer.SmallBellhopRenderer;
import net.mcreator.mysticgatherings.client.renderer.BellhopRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class MysticGatheringsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MysticGatheringsModEntities.MEDIUMBELLHOP.get(), BellhopRenderer::new);
		event.registerEntityRenderer(MysticGatheringsModEntities.SMALL_BELLHOP.get(), SmallBellhopRenderer::new);
	}
}