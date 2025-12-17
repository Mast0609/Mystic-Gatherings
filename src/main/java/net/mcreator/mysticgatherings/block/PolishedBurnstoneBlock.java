package net.mcreator.mysticgatherings.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PolishedBurnstoneBlock extends Block {
	public PolishedBurnstoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}