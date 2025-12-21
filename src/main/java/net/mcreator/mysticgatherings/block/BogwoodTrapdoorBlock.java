package net.mcreator.mysticgatherings.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class BogwoodTrapdoorBlock extends TrapDoorBlock {
	public BogwoodTrapdoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.WOOD).strength(2.4f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).ignitedByLava().instrument(NoteBlockInstrument.BASS));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}