package net.mcreator.mysticgatherings.procedures;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.mysticgatherings.network.MysticGatheringsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MystiaRegenTimerProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		MysticGatheringsModVariables.MapVariables.get(world).mystiaRegenTimer = MysticGatheringsModVariables.MapVariables.get(world).mystiaRegenTimer + 1;
		MysticGatheringsModVariables.MapVariables.get(world).markSyncDirty();
	}
}