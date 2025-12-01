package net.mcreator.mysticgatherings.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class MystiaOreBlock extends Block {
	public MystiaOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).lightLevel(s -> 2).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}