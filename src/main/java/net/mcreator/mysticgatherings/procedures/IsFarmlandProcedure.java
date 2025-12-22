package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class IsFarmlandProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean returnBool = false;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.FARMLAND) {
			returnBool = true;
		} else {
			returnBool = false;
		}
		return returnBool;
	}
}