package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.network.MysticGatheringsModVariables;

public class SwitchBarOrientationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).mystiaBarOrientation == 0) {
			{
				MysticGatheringsModVariables.PlayerVariables _vars = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES);
				_vars.mystiaBarOrientation = 1;
				_vars.markSyncDirty();
			}
		} else {
			{
				MysticGatheringsModVariables.PlayerVariables _vars = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES);
				_vars.mystiaBarOrientation = 0;
				_vars.markSyncDirty();
			}
		}
	}
}