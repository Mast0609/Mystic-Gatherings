package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.network.MysticGatheringsModVariables;

public class PlayerMystiaRegenProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (MysticGatheringsModVariables.MapVariables.get(world).mystiaRegenTimer >= 1200) {
			if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia < entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).maxPlayerMystia) {
				{
					MysticGatheringsModVariables.PlayerVariables _vars = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES);
					_vars.currentPlayerMystia = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia + 10;
					_vars.markSyncDirty();
				}
			}
		}
		MysticGatheringsModVariables.MapVariables.get(world).mystiaRegenTimer = 0;
		MysticGatheringsModVariables.MapVariables.get(world).markSyncDirty();
	}
}