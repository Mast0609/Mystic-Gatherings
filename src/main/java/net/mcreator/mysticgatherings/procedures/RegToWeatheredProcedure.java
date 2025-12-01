package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.mysticgatherings.init.MysticGatheringsModBlocks;

public class RegToWeatheredProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double randomChance = 0;
		randomChance = Mth.nextInt(RandomSource.create(), 1, 20);
		if (randomChance >= 15) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = MysticGatheringsModBlocks.WEATHERED_DREAL_BLOCK.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}