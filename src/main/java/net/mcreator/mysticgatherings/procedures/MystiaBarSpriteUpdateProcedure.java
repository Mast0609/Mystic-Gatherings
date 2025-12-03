package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.network.MysticGatheringsModVariables;

public class MystiaBarSpriteUpdateProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		double TenPercent = 0;
		double barState = 0;
		TenPercent = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).maxPlayerMystia / 10;
		if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 0) {
			barState = 0;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 1) {
			barState = 1;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 2) {
			barState = 2;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 3) {
			barState = 3;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 4) {
			barState = 4;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 5) {
			barState = 5;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 6) {
			barState = 6;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 7) {
			barState = 7;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 8) {
			barState = 8;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 9) {
			barState = 9;
		} else if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia == TenPercent * 10) {
			barState = 10;
		}
		return barState;
	}
}