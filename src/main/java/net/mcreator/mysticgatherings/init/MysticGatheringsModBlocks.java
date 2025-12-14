/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

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
	public static final DeferredBlock<Block> VERAWOOD_LOG;
	public static final DeferredBlock<Block> STRIPPED_VERAWOOD_LOG;
	public static final DeferredBlock<Block> STRIPPED_VERAWOOD_WOOD;
	public static final DeferredBlock<Block> VERAWOOD_WOOD;
	public static final DeferredBlock<Block> VERAWOOD_PLANKS;
	public static final DeferredBlock<Block> VERAWOOD_LEAVES;
	public static final DeferredBlock<Block> VERAWOOD_SAPLING;
	public static final DeferredBlock<Block> TIER_3_RITUAL_CIRCLE;
	public static final DeferredBlock<Block> T_1_RITUAL_CANDLE;
	public static final DeferredBlock<Block> T_2_RITUAL_CANDLE;
	public static final DeferredBlock<Block> T_3_RITUAL_CANDLE;
	public static final DeferredBlock<Block> STONE_CONDENSED_MYSTIA_ORE;
	public static final DeferredBlock<Block> DEEPSLATE_CONDENSED_MYSTIA_ORE;
	public static final DeferredBlock<Block> ENDSTONE_CONDENSED_MYSTIA_ORE;
	public static final DeferredBlock<Block> TRAVERTINE;
	public static final DeferredBlock<Block> TRAVERTINE_BRICKS;
	public static final DeferredBlock<Block> POLISHED_TRAVERTINE;
	public static final DeferredBlock<Block> CHISELED_TRAVERTINE;
	public static final DeferredBlock<Block> TRAVERTINE_PILLAR;
	public static final DeferredBlock<Block> TRAVERTINE_SLAB;
	public static final DeferredBlock<Block> TRAVERTINE_BRICKS_SLAB;
	public static final DeferredBlock<Block> POLISHED_TRAVERTINE_SLAB;
	public static final DeferredBlock<Block> TRAVERTINE_STAIRS;
	public static final DeferredBlock<Block> TRAVERTINE_BRICKS_STAIRS;
	public static final DeferredBlock<Block> POLISHED_TRAVERTINE_STAIRS;
	public static final DeferredBlock<Block> TRAVERTINE_WALL;
	public static final DeferredBlock<Block> TRAVERTINE_BRICKS_WALL;
	public static final DeferredBlock<Block> POLISHED_TRAVERTINE_WALL;
	public static final DeferredBlock<Block> ANCIENT_SHINGLES;
	public static final DeferredBlock<Block> ANCIENT_SHINGLES_SLAB;
	public static final DeferredBlock<Block> ANCIENT_SHINGLES_STAIRS;
	public static final DeferredBlock<Block> WHITE_SHINGLES;
	public static final DeferredBlock<Block> LIGHT_GRAY_SHINGLES;
	public static final DeferredBlock<Block> GRAY_SHINGLES;
	public static final DeferredBlock<Block> BLACK_SHINGLES;
	public static final DeferredBlock<Block> BROWN_SHINGLES;
	public static final DeferredBlock<Block> RED_SHINGLES;
	public static final DeferredBlock<Block> ORANGE_SHINGLES;
	public static final DeferredBlock<Block> YELLOW_SHINGLES;
	public static final DeferredBlock<Block> LIME_SHINGLES;
	public static final DeferredBlock<Block> GREEN_SHINGLES;
	public static final DeferredBlock<Block> CYAN_SHINGLES;
	public static final DeferredBlock<Block> LIGHT_BLUE_SHINGLES;
	public static final DeferredBlock<Block> BLUE_SHINGLES;
	public static final DeferredBlock<Block> PURPLE_SHINGLES;
	public static final DeferredBlock<Block> MAGENTA_SHINGLES;
	public static final DeferredBlock<Block> PINK_SHINGLES;
	public static final DeferredBlock<Block> FELDSPAR;
	public static final DeferredBlock<Block> POLISHED_FELDSPAR;
	public static final DeferredBlock<Block> FELDSPAR_BRICKS;
	public static final DeferredBlock<Block> FELDSPAR_PILLAR;
	public static final DeferredBlock<Block> CHISELED_FELDSPAR;
	public static final DeferredBlock<Block> FELDSPAR_BRICKS_SLAB;
	public static final DeferredBlock<Block> POLISHED_FELDSPAR_SLAB;
	public static final DeferredBlock<Block> FELDSPAR_SLAB;
	public static final DeferredBlock<Block> FELDSPAR_BRICKS_STAIRS;
	public static final DeferredBlock<Block> POLISHED_FELDSPAR_STAIRS;
	public static final DeferredBlock<Block> FELDSPAR_STAIRS;
	public static final DeferredBlock<Block> FELDSPAR_BRICKS_WALL;
	public static final DeferredBlock<Block> POLISHED_FELDSPAR_WALL;
	public static final DeferredBlock<Block> FELDSPAR_WALL;
	public static final DeferredBlock<Block> FIR_LOG;
	public static final DeferredBlock<Block> FIR_WOOD;
	public static final DeferredBlock<Block> STRIPPED_FIR_LOG;
	public static final DeferredBlock<Block> STRIPPED_FIR_WOOD;
	public static final DeferredBlock<Block> FIR_PLANKS;
	public static final DeferredBlock<Block> FIR_STAIRS;
	public static final DeferredBlock<Block> FIR_SLAB;
	public static final DeferredBlock<Block> FIR_FENCE;
	public static final DeferredBlock<Block> FIR_FENCE_GATE;
	public static final DeferredBlock<Block> FIR_DOOR;
	public static final DeferredBlock<Block> FIR_TRAPDOOR;
	public static final DeferredBlock<Block> FIR_PRESSURE_PLATE;
	public static final DeferredBlock<Block> FIR_BUTTON;
	public static final DeferredBlock<Block> PEAT_SOIL;
	public static final DeferredBlock<Block> SPHAGNUM_MOSS;
	public static final DeferredBlock<Block> SPHAGNUM_MOSS_COVERED_PEAT;
	public static final DeferredBlock<Block> STATUE;
	public static final DeferredBlock<Block> SPHAGNUM_MOSS_CARPET;
	public static final DeferredBlock<Block> SPHAGNUM_MOSS_VINE;
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
		VERAWOOD_LOG = register("verawood_log", VerawoodLogBlock::new);
		STRIPPED_VERAWOOD_LOG = register("stripped_verawood_log", StrippedVerawoodLogBlock::new);
		STRIPPED_VERAWOOD_WOOD = register("stripped_verawood_wood", StrippedVerawoodWoodBlock::new);
		VERAWOOD_WOOD = register("verawood_wood", VerawoodWoodBlock::new);
		VERAWOOD_PLANKS = register("verawood_planks", VerawoodPlanksBlock::new);
		VERAWOOD_LEAVES = register("verawood_leaves", VerawoodLeavesBlock::new);
		VERAWOOD_SAPLING = register("verawood_sapling", VerawoodSaplingBlock::new);
		TIER_3_RITUAL_CIRCLE = register("tier_3_ritual_circle", Tier3RitualCircleBlock::new);
		T_1_RITUAL_CANDLE = register("t_1_ritual_candle", T1RitualCandleBlock::new);
		T_2_RITUAL_CANDLE = register("t_2_ritual_candle", T2RitualCandleBlock::new);
		T_3_RITUAL_CANDLE = register("t_3_ritual_candle", T3RitualCandleBlock::new);
		STONE_CONDENSED_MYSTIA_ORE = register("stone_condensed_mystia_ore", StoneCondensedMystiaOreBlock::new);
		DEEPSLATE_CONDENSED_MYSTIA_ORE = register("deepslate_condensed_mystia_ore", DeepslateCondensedMystiaOreBlock::new);
		ENDSTONE_CONDENSED_MYSTIA_ORE = register("endstone_condensed_mystia_ore", EndstoneCondensedMystiaOreBlock::new);
		TRAVERTINE = register("travertine", TravertineBlock::new);
		TRAVERTINE_BRICKS = register("travertine_bricks", TravertineBricksBlock::new);
		POLISHED_TRAVERTINE = register("polished_travertine", PolishedTravertineBlock::new);
		CHISELED_TRAVERTINE = register("chiseled_travertine", ChiseledTravertineBlock::new);
		TRAVERTINE_PILLAR = register("travertine_pillar", TravertinePillarBlock::new);
		TRAVERTINE_SLAB = register("travertine_slab", TravertineSlabBlock::new);
		TRAVERTINE_BRICKS_SLAB = register("travertine_bricks_slab", TravertineBricksSlabBlock::new);
		POLISHED_TRAVERTINE_SLAB = register("polished_travertine_slab", PolishedTravertineSlabBlock::new);
		TRAVERTINE_STAIRS = register("travertine_stairs", TravertineStairsBlock::new);
		TRAVERTINE_BRICKS_STAIRS = register("travertine_bricks_stairs", TravertineBricksStairsBlock::new);
		POLISHED_TRAVERTINE_STAIRS = register("polished_travertine_stairs", PolishedTravertineStairsBlock::new);
		TRAVERTINE_WALL = register("travertine_wall", TravertineWallBlock::new);
		TRAVERTINE_BRICKS_WALL = register("travertine_bricks_wall", TravertineBricksWallBlock::new);
		POLISHED_TRAVERTINE_WALL = register("polished_travertine_wall", PolishedTravertineWallBlock::new);
		ANCIENT_SHINGLES = register("ancient_shingles", AncientShinglesBlock::new);
		ANCIENT_SHINGLES_SLAB = register("ancient_shingles_slab", AncientShinglesSlabBlock::new);
		ANCIENT_SHINGLES_STAIRS = register("ancient_shingles_stairs", AncientShinglesStairsBlock::new);
		WHITE_SHINGLES = register("white_shingles", WhiteShinglesBlock::new);
		LIGHT_GRAY_SHINGLES = register("light_gray_shingles", LightGrayShinglesBlock::new);
		GRAY_SHINGLES = register("gray_shingles", GrayShinglesBlock::new);
		BLACK_SHINGLES = register("black_shingles", BlackShinglesBlock::new);
		BROWN_SHINGLES = register("brown_shingles", BrownShinglesBlock::new);
		RED_SHINGLES = register("red_shingles", RedShinglesBlock::new);
		ORANGE_SHINGLES = register("orange_shingles", OrangeShinglesBlock::new);
		YELLOW_SHINGLES = register("yellow_shingles", YellowShinglesBlock::new);
		LIME_SHINGLES = register("lime_shingles", LimeShinglesBlock::new);
		GREEN_SHINGLES = register("green_shingles", GreenShinglesBlock::new);
		CYAN_SHINGLES = register("cyan_shingles", CyanShinglesBlock::new);
		LIGHT_BLUE_SHINGLES = register("light_blue_shingles", LightBlueShinglesBlock::new);
		BLUE_SHINGLES = register("blue_shingles", BlueShinglesBlock::new);
		PURPLE_SHINGLES = register("purple_shingles", PurpleShinglesBlock::new);
		MAGENTA_SHINGLES = register("magenta_shingles", MagentaShinglesBlock::new);
		PINK_SHINGLES = register("pink_shingles", PinkShinglesBlock::new);
		FELDSPAR = register("feldspar", FeldsparBlock::new);
		POLISHED_FELDSPAR = register("polished_feldspar", PolishedFeldsparBlock::new);
		FELDSPAR_BRICKS = register("feldspar_bricks", FeldsparBricksBlock::new);
		FELDSPAR_PILLAR = register("feldspar_pillar", FeldsparPillarBlock::new);
		CHISELED_FELDSPAR = register("chiseled_feldspar", ChiseledFeldsparBlock::new);
		FELDSPAR_BRICKS_SLAB = register("feldspar_bricks_slab", FeldsparBricksSlabBlock::new);
		POLISHED_FELDSPAR_SLAB = register("polished_feldspar_slab", PolishedFeldsparSlabBlock::new);
		FELDSPAR_SLAB = register("feldspar_slab", FeldsparSlabBlock::new);
		FELDSPAR_BRICKS_STAIRS = register("feldspar_bricks_stairs", FeldsparBricksStairsBlock::new);
		POLISHED_FELDSPAR_STAIRS = register("polished_feldspar_stairs", PolishedFeldsparStairsBlock::new);
		FELDSPAR_STAIRS = register("feldspar_stairs", FeldsparStairsBlock::new);
		FELDSPAR_BRICKS_WALL = register("feldspar_bricks_wall", FeldsparBricksWallBlock::new);
		POLISHED_FELDSPAR_WALL = register("polished_feldspar_wall", PolishedFeldsparWallBlock::new);
		FELDSPAR_WALL = register("feldspar_wall", FeldsparWallBlock::new);
		FIR_LOG = register("fir_log", FirLogBlock::new);
		FIR_WOOD = register("fir_wood", FirWoodBlock::new);
		STRIPPED_FIR_LOG = register("stripped_fir_log", StrippedFirLogBlock::new);
		STRIPPED_FIR_WOOD = register("stripped_fir_wood", StrippedFirWoodBlock::new);
		FIR_PLANKS = register("fir_planks", FirPlanksBlock::new);
		FIR_STAIRS = register("fir_stairs", FirStairsBlock::new);
		FIR_SLAB = register("fir_slab", FirSlabBlock::new);
		FIR_FENCE = register("fir_fence", FirFenceBlock::new);
		FIR_FENCE_GATE = register("fir_fence_gate", FirFenceGateBlock::new);
		FIR_DOOR = register("fir_door", FirDoorBlock::new);
		FIR_TRAPDOOR = register("fir_trapdoor", FirTrapdoorBlock::new);
		FIR_PRESSURE_PLATE = register("fir_pressure_plate", FirPressurePlateBlock::new);
		FIR_BUTTON = register("fir_button", FirButtonBlock::new);
		PEAT_SOIL = register("peat_soil", PeatSoilBlock::new);
		SPHAGNUM_MOSS = register("sphagnum_moss", SphagnumMossBlock::new);
		SPHAGNUM_MOSS_COVERED_PEAT = register("sphagnum_moss_covered_peat", SphagnumMossCoveredPeatBlock::new);
		STATUE = register("statue", StatueBlock::new);
		SPHAGNUM_MOSS_CARPET = register("sphagnum_moss_carpet", SphagnumMossCarpetBlock::new);
		SPHAGNUM_MOSS_VINE = register("sphagnum_moss_vine", SphagnumMossVineBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}

	@EventBusSubscriber(Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			VerawoodLeavesBlock.blockColorLoad(event);
		}
	}
}