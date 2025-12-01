package net.mcreator.mysticgatherings.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class OrphBlockBlock extends Block {
	public OrphBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1f, 25f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BELL));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}