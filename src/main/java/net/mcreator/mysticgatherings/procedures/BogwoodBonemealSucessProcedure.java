package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class BogwoodBonemealSucessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("mystic_gatherings:bogwood_tree"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
					BlockPos.containing(x, y, z));
	}
}