package net.mcreator.mysticgatherings.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class RedShinglesBlock extends Block {
	public RedShinglesBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.25f, 7.5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}