package net.mcreator.mysticgatherings.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.Blocks;

public class PolishedTravertineStairsBlock extends StairBlock {
	public PolishedTravertineStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.strength(1.25f, 7.5f).requiresCorrectToolForDrops());
	}

	@Override
	public float getExplosionResistance() {
		return 7.5f;
	}
}