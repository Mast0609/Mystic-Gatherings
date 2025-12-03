package net.mcreator.mysticgatherings.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.network.MysticGatheringsModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class PlayerMystiaRegenProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (MysticGatheringsModVariables.WorldVariables.get(world).mystiaRegenTimer >= 1200) {
			if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia < entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).maxPlayerMystia) {
				{
					MysticGatheringsModVariables.PlayerVariables _vars = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES);
					_vars.currentPlayerMystia = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia + 10;
					_vars.markSyncDirty();
				}
			}
			MysticGatheringsModVariables.WorldVariables.get(world).mystiaRegenTimer = 0;
			MysticGatheringsModVariables.WorldVariables.get(world).markSyncDirty();
		}
	}
}