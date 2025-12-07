package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class T2SpiralUpdateProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		double returnValue = 0;
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "activationTimer") > 0) {
			returnValue = 1;
		} else {
			returnValue = 0;
		}
		return returnValue;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}