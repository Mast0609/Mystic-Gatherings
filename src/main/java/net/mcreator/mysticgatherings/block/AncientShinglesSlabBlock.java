package net.mcreator.mysticgatherings.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SlabBlock;

public class AncientShinglesSlabBlock extends SlabBlock {
	public AncientShinglesSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1.25f, 7.5f).requiresCorrectToolForDrops());
	}
}