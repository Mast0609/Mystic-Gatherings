package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.network.MysticGatheringsModVariables;

public class HorizontalTrueProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean orientationBool = false;
		if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).mystiaBarOrientation == 0) {
			orientationBool = true;
		} else {
			orientationBool = false;
		}
		return orientationBool;
	}
}