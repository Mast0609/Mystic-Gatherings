package net.mcreator.mysticgatherings.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class PolishedBurnstoneBricksBlock extends Block {
	public PolishedBurnstoneBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(1f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}