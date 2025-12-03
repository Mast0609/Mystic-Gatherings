package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.network.MysticGatheringsModVariables;

public class MystiaReset1001Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			MysticGatheringsModVariables.PlayerVariables _vars = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES);
			_vars.currentPlayerMystia = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).maxPlayerMystia;
			_vars.markSyncDirty();
		}
	}
}