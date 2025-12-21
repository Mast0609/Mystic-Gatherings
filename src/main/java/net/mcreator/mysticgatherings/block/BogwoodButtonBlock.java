package net.mcreator.mysticgatherings.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class BogwoodButtonBlock extends ButtonBlock {
	public BogwoodButtonBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, 30, properties.sound(SoundType.WOOD).strength(0.4f).noCollission().pushReaction(PushReaction.DESTROY));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}