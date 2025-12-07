package net.mcreator.mysticgatherings.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.Minecraft;

import net.mcreator.mysticgatherings.procedures.VerticalTrueProcedure;
import net.mcreator.mysticgatherings.procedures.MystiaBarSpriteUpdateProcedure;
import net.mcreator.mysticgatherings.procedures.HorizontalTrueProcedure;

@EventBusSubscriber(Dist.CLIENT)
public class MystiaBarOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			if (HorizontalTrueProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("mystic_gatherings:textures/screens/mystiabarspritesheet.png"), w / 2 + -100, 5,
						Mth.clamp((int) MystiaBarSpriteUpdateProcedure.execute(entity) * 201, 0, 2010), 0, 201, 5, 2211, 5);
			}
			if (VerticalTrueProcedure.execute(entity)) {
				event.getGuiGraphics().blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("mystic_gatherings:textures/screens/verticalmystiabarspritesheet.png"), 6, h / 2 + -106, 0,
						Mth.clamp((int) MystiaBarSpriteUpdateProcedure.execute(entity) * 201, 0, 2010), 5, 201, 5, 2211);
			}
		}
	}
}