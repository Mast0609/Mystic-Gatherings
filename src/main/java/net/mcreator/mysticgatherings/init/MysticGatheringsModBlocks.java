/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.mysticgatherings.block.*;
import net.mcreator.mysticgatherings.MysticGatheringsMod;

import java.util.function.Function;

public class MysticGatheringsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(MysticGatheringsMod.MODID);
	public static final DeferredBlock<Block> STONE_ORPH_ORE;
	public static final DeferredBlock<Block> ORPH_BLOCK;
	public static final DeferredBlock<Block> DEEPSLATE_ORPH_ORE;
	public static final DeferredBlock<Block> STONE_DREAL_ORE;
	public static final DeferredBlock<Block> DEEPSLATE_DREAL_ORE;
	public static final DeferredBlock<Block> DREAL_BLOCK;
	public static final DeferredBlock<Block> WEATHERED_DREAL_BLOCK;
	public static final DeferredBlock<Block> OXIDIZED_DREAL_BLOCK;
	public static final DeferredBlock<Block> WAXED_DREAL_BLOCK;
	public static final DeferredBlock<Block> WAXED_WEATHERED_DREAL_BLOCK;
	public static final DeferredBlock<Block> WAXED_OXIDIZED_DREAL_BLOCK;
	public static final DeferredBlock<Block> MYSTIA_ORE;
	public static final DeferredBlock<Block> MYSTIA_BLOCK;
	public static final DeferredBlock<Block> TIER_1_RITUAL_CIRCLE;
	public static final DeferredBlock<Block> TIER_2_RITUAL_CIRCLE;
	static {
		STONE_ORPH_ORE = register("stone_orph_ore", StoneOrphOreBlock::new);
		ORPH_BLOCK = register("orph_block", OrphBlockBlock::new);
		DEEPSLATE_ORPH_ORE = register("deepslate_orph_ore", DeepslateOrphOreBlock::new);
		STONE_DREAL_ORE = register("stone_dreal_ore", StoneDrealOreBlock::new);
		DEEPSLATE_DREAL_ORE = register("deepslate_dreal_ore", DeepslateDrealOreBlock::new);
		DREAL_BLOCK = register("dreal_block", DrealBlockBlock::new);
		WEATHERED_DREAL_BLOCK = register("weathered_dreal_block", WeatheredDrealBlockBlock::new);
		OXIDIZED_DREAL_BLOCK = register("oxidized_dreal_block", OxidizedDrealBlockBlock::new);
		WAXED_DREAL_BLOCK = register("waxed_dreal_block", WaxedDrealBlockBlock::new);
		WAXED_WEATHERED_DREAL_BLOCK = register("waxed_weathered_dreal_block", WaxedWeatheredDrealBlockBlock::new);
		WAXED_OXIDIZED_DREAL_BLOCK = register("waxed_oxidized_dreal_block", WaxedOxidizedDrealBlockBlock::new);
		MYSTIA_ORE = register("mystia_ore", MystiaOreBlock::new);
		MYSTIA_BLOCK = register("mystia_block", MystiaBlockBlock::new);
		TIER_1_RITUAL_CIRCLE = register("tier_1_ritual_circle", Tier1RitualCircleBlock::new);
		TIER_2_RITUAL_CIRCLE = register("tier_2_ritual_circle", Tier2RitualCircleBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}