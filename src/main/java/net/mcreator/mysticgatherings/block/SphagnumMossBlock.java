package net.mcreator.mysticgatherings.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SphagnumMossBlock extends Block {
	public SphagnumMossBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.MUD).strength(1f, 5f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}