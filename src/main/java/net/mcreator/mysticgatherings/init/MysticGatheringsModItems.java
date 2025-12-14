/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mysticgatherings.item.inventory.LeatherSackInventoryCapability;
import net.mcreator.mysticgatherings.item.*;
import net.mcreator.mysticgatherings.MysticGatheringsMod;

import java.util.function.Function;

@EventBusSubscriber
public class MysticGatheringsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MysticGatheringsMod.MODID);
	public static final DeferredItem<Item> RAW_ORPH;
	public static final DeferredItem<Item> STONE_ORPH_ORE;
	public static final DeferredItem<Item> ORPH_INGOT;
	public static final DeferredItem<Item> ORPH_BLOCK;
	public static final DeferredItem<Item> DEEPSLATE_ORPH_ORE;
	public static final DeferredItem<Item> RAW_DREAL;
	public static final DeferredItem<Item> DREAL_INGOT;
	public static final DeferredItem<Item> STONE_DREAL_ORE;
	public static final DeferredItem<Item> DEEPSLATE_DREAL_ORE;
	public static final DeferredItem<Item> DREAL_BLOCK;
	public static final DeferredItem<Item> WEATHERED_DREAL_BLOCK;
	public static final DeferredItem<Item> OXIDIZED_DREAL_BLOCK;
	public static final DeferredItem<Item> WAXED_DREAL_BLOCK;
	public static final DeferredItem<Item> WAXED_WEATHERED_DREAL_BLOCK;
	public static final DeferredItem<Item> WAXED_OXIDIZED_DREAL_BLOCK;
	public static final DeferredItem<Item> RAW_MYSTIA_GEM;
	public static final DeferredItem<Item> MYSTIA_ORE;
	public static final DeferredItem<Item> POLISHING_CLOTH;
	public static final DeferredItem<Item> POLISHED_MYSTIA_GEM;
	public static final DeferredItem<Item> MYSTIA_BLOCK;
	public static final DeferredItem<Item> TIER_1_RITUAL_CIRCLE;
	public static final DeferredItem<Item> TIER_2_RITUAL_CIRCLE;
	public static final DeferredItem<Item> AGRIUM_INGOT;
	public static final DeferredItem<Item> CALDON_INGOT;
	public static final DeferredItem<Item> ABARASH_INGOT;
	public static final DeferredItem<Item> VERITA_INGOT;
	public static final DeferredItem<Item> BRADISH_INGOT;
	public static final DeferredItem<Item> ORPH_ARMOR_HELMET;
	public static final DeferredItem<Item> ORPH_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> ORPH_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> ORPH_ARMOR_BOOTS;
	public static final DeferredItem<Item> VERAWOOD_LOG;
	public static final DeferredItem<Item> STRIPPED_VERAWOOD_LOG;
	public static final DeferredItem<Item> STRIPPED_VERAWOOD_WOOD;
	public static final DeferredItem<Item> VERAWOOD_WOOD;
	public static final DeferredItem<Item> VERAWOOD_PLANKS;
	public static final DeferredItem<Item> VERAWOOD_LEAVES;
	public static final DeferredItem<Item> VERAWOOD_SAPLING;
	public static final DeferredItem<Item> LEATHER_SACK;
	public static final DeferredItem<Item> TIER_3_RITUAL_CIRCLE;
	public static final DeferredItem<Item> T_1_RITUAL_CANDLE;
	public static final DeferredItem<Item> T_2_RITUAL_CANDLE;
	public static final DeferredItem<Item> T_3_RITUAL_CANDLE;
	public static final DeferredItem<Item> STONE_CONDENSED_MYSTIA_ORE;
	public static final DeferredItem<Item> RAW_CONDENSED_MYSTIA;
	public static final DeferredItem<Item> DEEPSLATE_CONDENSED_MYSTIA_ORE;
	public static final DeferredItem<Item> ENDSTONE_CONDENSED_MYSTIA_ORE;
	public static final DeferredItem<Item> CONDENSED_MYSTIA_PEARL;
	public static final DeferredItem<Item> ORPH_NUGGET;
	public static final DeferredItem<Item> DREAL_ARMOR_HELMET;
	public static final DeferredItem<Item> DREAL_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> DREAL_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> DREAL_ARMOR_BOOTS;
	public static final DeferredItem<Item> DREAL_SWORD;
	public static final DeferredItem<Item> DREAL_AXE;
	public static final DeferredItem<Item> DREAL_PICKAXE;
	public static final DeferredItem<Item> DREAL_SHOVEL;
	public static final DeferredItem<Item> DREAL_HOE;
	public static final DeferredItem<Item> DREAL_NUGGET;
	public static final DeferredItem<Item> ORPH_HOE;
	public static final DeferredItem<Item> ORPH_SHOVEL;
	public static final DeferredItem<Item> ORPH_PICKAXE;
	public static final DeferredItem<Item> ORPH_AXE;
	public static final DeferredItem<Item> ORPH_SWORD;
	public static final DeferredItem<Item> MEDIUMBELLHOP_SPAWN_EGG;
	public static final DeferredItem<Item> SMALL_BELLHOP_SPAWN_EGG;
	public static final DeferredItem<Item> TRAVERTINE;
	public static final DeferredItem<Item> TRAVERTINE_BRICKS;
	public static final DeferredItem<Item> POLISHED_TRAVERTINE;
	public static final DeferredItem<Item> CHISELED_TRAVERTINE;
	public static final DeferredItem<Item> TRAVERTINE_PILLAR;
	public static final DeferredItem<Item> TRAVERTINE_SLAB;
	public static final DeferredItem<Item> TRAVERTINE_BRICKS_SLAB;
	public static final DeferredItem<Item> POLISHED_TRAVERTINE_SLAB;
	public static final DeferredItem<Item> TRAVERTINE_STAIRS;
	public static final DeferredItem<Item> TRAVERTINE_BRICKS_STAIRS;
	public static final DeferredItem<Item> POLISHED_TRAVERTINE_STAIRS;
	public static final DeferredItem<Item> TRAVERTINE_WALL;
	public static final DeferredItem<Item> TRAVERTINE_BRICKS_WALL;
	public static final DeferredItem<Item> POLISHED_TRAVERTINE_WALL;
	public static final DeferredItem<Item> ANCIENT_SHINGLES;
	public static final DeferredItem<Item> ANCIENT_SHINGLES_SLAB;
	public static final DeferredItem<Item> ANCIENT_SHINGLES_STAIRS;
	public static final DeferredItem<Item> WHITE_SHINGLES;
	public static final DeferredItem<Item> LIGHT_GRAY_SHINGLES;
	public static final DeferredItem<Item> GRAY_SHINGLES;
	public static final DeferredItem<Item> BLACK_SHINGLES;
	public static final DeferredItem<Item> BROWN_SHINGLES;
	public static final DeferredItem<Item> RED_SHINGLES;
	public static final DeferredItem<Item> ORANGE_SHINGLES;
	public static final DeferredItem<Item> YELLOW_SHINGLES;
	public static final DeferredItem<Item> LIME_SHINGLES;
	public static final DeferredItem<Item> GREEN_SHINGLES;
	public static final DeferredItem<Item> CYAN_SHINGLES;
	public static final DeferredItem<Item> LIGHT_BLUE_SHINGLES;
	public static final DeferredItem<Item> BLUE_SHINGLES;
	public static final DeferredItem<Item> PURPLE_SHINGLES;
	public static final DeferredItem<Item> MAGENTA_SHINGLES;
	public static final DeferredItem<Item> PINK_SHINGLES;
	public static final DeferredItem<Item> FELDSPAR;
	public static final DeferredItem<Item> POLISHED_FELDSPAR;
	public static final DeferredItem<Item> FELDSPAR_BRICKS;
	public static final DeferredItem<Item> FELDSPAR_PILLAR;
	public static final DeferredItem<Item> CHISELED_FELDSPAR;
	public static final DeferredItem<Item> FELDSPAR_BRICKS_SLAB;
	public static final DeferredItem<Item> POLISHED_FELDSPAR_SLAB;
	public static final DeferredItem<Item> FELDSPAR_SLAB;
	public static final DeferredItem<Item> FELDSPAR_BRICKS_STAIRS;
	public static final DeferredItem<Item> POLISHED_FELDSPAR_STAIRS;
	public static final DeferredItem<Item> FELDSPAR_STAIRS;
	public static final DeferredItem<Item> FELDSPAR_BRICKS_WALL;
	public static final DeferredItem<Item> POLISHED_FELDSPAR_WALL;
	public static final DeferredItem<Item> FELDSPAR_WALL;
	public static final DeferredItem<Item> FIR_LOG;
	public static final DeferredItem<Item> FIR_WOOD;
	public static final DeferredItem<Item> STRIPPED_FIR_LOG;
	public static final DeferredItem<Item> STRIPPED_FIR_WOOD;
	public static final DeferredItem<Item> FIR_PLANKS;
	public static final DeferredItem<Item> FIR_STAIRS;
	public static final DeferredItem<Item> FIR_SLAB;
	public static final DeferredItem<Item> FIR_FENCE;
	public static final DeferredItem<Item> FIR_FENCE_GATE;
	public static final DeferredItem<Item> FIR_DOOR;
	public static final DeferredItem<Item> FIR_TRAPDOOR;
	public static final DeferredItem<Item> FIR_PRESSURE_PLATE;
	public static final DeferredItem<Item> FIR_BUTTON;
	public static final DeferredItem<Item> PEAT_SOIL;
	public static final DeferredItem<Item> SPHAGNUM_MOSS;
	public static final DeferredItem<Item> SPHAGNUM_MOSS_COVERED_PEAT;
	public static final DeferredItem<Item> STATUE;
	public static final DeferredItem<Item> SPHAGNUM_MOSS_CARPET;
	public static final DeferredItem<Item> SPHAGNUM_MOSS_VINE;
	static {
		RAW_ORPH = register("raw_orph", RawOrphItem::new);
		STONE_ORPH_ORE = block(MysticGatheringsModBlocks.STONE_ORPH_ORE);
		ORPH_INGOT = register("orph_ingot", OrphIngotItem::new);
		ORPH_BLOCK = block(MysticGatheringsModBlocks.ORPH_BLOCK);
		DEEPSLATE_ORPH_ORE = block(MysticGatheringsModBlocks.DEEPSLATE_ORPH_ORE);
		RAW_DREAL = register("raw_dreal", RawDrealItem::new);
		DREAL_INGOT = register("dreal_ingot", DrealIngotItem::new);
		STONE_DREAL_ORE = block(MysticGatheringsModBlocks.STONE_DREAL_ORE);
		DEEPSLATE_DREAL_ORE = block(MysticGatheringsModBlocks.DEEPSLATE_DREAL_ORE);
		DREAL_BLOCK = block(MysticGatheringsModBlocks.DREAL_BLOCK);
		WEATHERED_DREAL_BLOCK = block(MysticGatheringsModBlocks.WEATHERED_DREAL_BLOCK);
		OXIDIZED_DREAL_BLOCK = block(MysticGatheringsModBlocks.OXIDIZED_DREAL_BLOCK);
		WAXED_DREAL_BLOCK = block(MysticGatheringsModBlocks.WAXED_DREAL_BLOCK);
		WAXED_WEATHERED_DREAL_BLOCK = block(MysticGatheringsModBlocks.WAXED_WEATHERED_DREAL_BLOCK);
		WAXED_OXIDIZED_DREAL_BLOCK = block(MysticGatheringsModBlocks.WAXED_OXIDIZED_DREAL_BLOCK);
		RAW_MYSTIA_GEM = register("raw_mystia_gem", RawMystiaItem::new);
		MYSTIA_ORE = block(MysticGatheringsModBlocks.MYSTIA_ORE, new Item.Properties().rarity(Rarity.RARE));
		POLISHING_CLOTH = register("polishing_cloth", PolishingClothItem::new);
		POLISHED_MYSTIA_GEM = register("polished_mystia_gem", PolishedMystiaItem::new);
		MYSTIA_BLOCK = block(MysticGatheringsModBlocks.MYSTIA_BLOCK, new Item.Properties().rarity(Rarity.RARE));
		TIER_1_RITUAL_CIRCLE = block(MysticGatheringsModBlocks.TIER_1_RITUAL_CIRCLE, new Item.Properties().rarity(Rarity.RARE));
		TIER_2_RITUAL_CIRCLE = block(MysticGatheringsModBlocks.TIER_2_RITUAL_CIRCLE, new Item.Properties().rarity(Rarity.EPIC));
		AGRIUM_INGOT = register("agrium_ingot", AgriumIngotItem::new);
		CALDON_INGOT = register("caldon_ingot", CaldonIngotItem::new);
		ABARASH_INGOT = register("abarash_ingot", AbarashIngotItem::new);
		VERITA_INGOT = register("verita_ingot", VeritaIngotItem::new);
		BRADISH_INGOT = register("bradish_ingot", BradishIngotItem::new);
		ORPH_ARMOR_HELMET = register("orph_armor_helmet", OrphArmorItem.Helmet::new);
		ORPH_ARMOR_CHESTPLATE = register("orph_armor_chestplate", OrphArmorItem.Chestplate::new);
		ORPH_ARMOR_LEGGINGS = register("orph_armor_leggings", OrphArmorItem.Leggings::new);
		ORPH_ARMOR_BOOTS = register("orph_armor_boots", OrphArmorItem.Boots::new);
		VERAWOOD_LOG = block(MysticGatheringsModBlocks.VERAWOOD_LOG);
		STRIPPED_VERAWOOD_LOG = block(MysticGatheringsModBlocks.STRIPPED_VERAWOOD_LOG);
		STRIPPED_VERAWOOD_WOOD = block(MysticGatheringsModBlocks.STRIPPED_VERAWOOD_WOOD);
		VERAWOOD_WOOD = block(MysticGatheringsModBlocks.VERAWOOD_WOOD);
		VERAWOOD_PLANKS = block(MysticGatheringsModBlocks.VERAWOOD_PLANKS);
		VERAWOOD_LEAVES = block(MysticGatheringsModBlocks.VERAWOOD_LEAVES);
		VERAWOOD_SAPLING = block(MysticGatheringsModBlocks.VERAWOOD_SAPLING);
		LEATHER_SACK = register("leather_sack", LeatherSackItem::new);
		TIER_3_RITUAL_CIRCLE = block(MysticGatheringsModBlocks.TIER_3_RITUAL_CIRCLE, new Item.Properties().rarity(Rarity.EPIC));
		T_1_RITUAL_CANDLE = block(MysticGatheringsModBlocks.T_1_RITUAL_CANDLE);
		T_2_RITUAL_CANDLE = block(MysticGatheringsModBlocks.T_2_RITUAL_CANDLE);
		T_3_RITUAL_CANDLE = block(MysticGatheringsModBlocks.T_3_RITUAL_CANDLE);
		STONE_CONDENSED_MYSTIA_ORE = block(MysticGatheringsModBlocks.STONE_CONDENSED_MYSTIA_ORE);
		RAW_CONDENSED_MYSTIA = register("raw_condensed_mystia", RawCondensedMystiaItem::new);
		DEEPSLATE_CONDENSED_MYSTIA_ORE = block(MysticGatheringsModBlocks.DEEPSLATE_CONDENSED_MYSTIA_ORE);
		ENDSTONE_CONDENSED_MYSTIA_ORE = block(MysticGatheringsModBlocks.ENDSTONE_CONDENSED_MYSTIA_ORE);
		CONDENSED_MYSTIA_PEARL = register("condensed_mystia_pearl", CondensedMystiaPearlItem::new);
		ORPH_NUGGET = register("orph_nugget", OrphNuggetItem::new);
		DREAL_ARMOR_HELMET = register("dreal_armor_helmet", DrealArmorItem.Helmet::new);
		DREAL_ARMOR_CHESTPLATE = register("dreal_armor_chestplate", DrealArmorItem.Chestplate::new);
		DREAL_ARMOR_LEGGINGS = register("dreal_armor_leggings", DrealArmorItem.Leggings::new);
		DREAL_ARMOR_BOOTS = register("dreal_armor_boots", DrealArmorItem.Boots::new);
		DREAL_SWORD = register("dreal_sword", DrealSwordItem::new);
		DREAL_AXE = register("dreal_axe", DrealAxeItem::new);
		DREAL_PICKAXE = register("dreal_pickaxe", DrealPickaxeItem::new);
		DREAL_SHOVEL = register("dreal_shovel", DrealShovelItem::new);
		DREAL_HOE = register("dreal_hoe", DrealHoeItem::new);
		DREAL_NUGGET = register("dreal_nugget", DrealNuggetItem::new);
		ORPH_HOE = register("orph_hoe", OrphHoeItem::new);
		ORPH_SHOVEL = register("orph_shovel", OrphShovelItem::new);
		ORPH_PICKAXE = register("orph_pickaxe", OrphPickaxeItem::new);
		ORPH_AXE = register("orph_axe", OrphAxeItem::new);
		ORPH_SWORD = register("orph_sword", OrphSwordItem::new);
		MEDIUMBELLHOP_SPAWN_EGG = register("mediumbellhop_spawn_egg", properties -> new SpawnEggItem(MysticGatheringsModEntities.MEDIUMBELLHOP.get(), properties));
		SMALL_BELLHOP_SPAWN_EGG = register("small_bellhop_spawn_egg", properties -> new SpawnEggItem(MysticGatheringsModEntities.SMALL_BELLHOP.get(), properties));
		TRAVERTINE = block(MysticGatheringsModBlocks.TRAVERTINE);
		TRAVERTINE_BRICKS = block(MysticGatheringsModBlocks.TRAVERTINE_BRICKS);
		POLISHED_TRAVERTINE = block(MysticGatheringsModBlocks.POLISHED_TRAVERTINE);
		CHISELED_TRAVERTINE = block(MysticGatheringsModBlocks.CHISELED_TRAVERTINE);
		TRAVERTINE_PILLAR = block(MysticGatheringsModBlocks.TRAVERTINE_PILLAR);
		TRAVERTINE_SLAB = block(MysticGatheringsModBlocks.TRAVERTINE_SLAB);
		TRAVERTINE_BRICKS_SLAB = block(MysticGatheringsModBlocks.TRAVERTINE_BRICKS_SLAB);
		POLISHED_TRAVERTINE_SLAB = block(MysticGatheringsModBlocks.POLISHED_TRAVERTINE_SLAB);
		TRAVERTINE_STAIRS = block(MysticGatheringsModBlocks.TRAVERTINE_STAIRS);
		TRAVERTINE_BRICKS_STAIRS = block(MysticGatheringsModBlocks.TRAVERTINE_BRICKS_STAIRS);
		POLISHED_TRAVERTINE_STAIRS = block(MysticGatheringsModBlocks.POLISHED_TRAVERTINE_STAIRS);
		TRAVERTINE_WALL = block(MysticGatheringsModBlocks.TRAVERTINE_WALL);
		TRAVERTINE_BRICKS_WALL = block(MysticGatheringsModBlocks.TRAVERTINE_BRICKS_WALL);
		POLISHED_TRAVERTINE_WALL = block(MysticGatheringsModBlocks.POLISHED_TRAVERTINE_WALL);
		ANCIENT_SHINGLES = block(MysticGatheringsModBlocks.ANCIENT_SHINGLES);
		ANCIENT_SHINGLES_SLAB = block(MysticGatheringsModBlocks.ANCIENT_SHINGLES_SLAB);
		ANCIENT_SHINGLES_STAIRS = block(MysticGatheringsModBlocks.ANCIENT_SHINGLES_STAIRS);
		WHITE_SHINGLES = block(MysticGatheringsModBlocks.WHITE_SHINGLES);
		LIGHT_GRAY_SHINGLES = block(MysticGatheringsModBlocks.LIGHT_GRAY_SHINGLES);
		GRAY_SHINGLES = block(MysticGatheringsModBlocks.GRAY_SHINGLES);
		BLACK_SHINGLES = block(MysticGatheringsModBlocks.BLACK_SHINGLES);
		BROWN_SHINGLES = block(MysticGatheringsModBlocks.BROWN_SHINGLES);
		RED_SHINGLES = block(MysticGatheringsModBlocks.RED_SHINGLES);
		ORANGE_SHINGLES = block(MysticGatheringsModBlocks.ORANGE_SHINGLES);
		YELLOW_SHINGLES = block(MysticGatheringsModBlocks.YELLOW_SHINGLES);
		LIME_SHINGLES = block(MysticGatheringsModBlocks.LIME_SHINGLES);
		GREEN_SHINGLES = block(MysticGatheringsModBlocks.GREEN_SHINGLES);
		CYAN_SHINGLES = block(MysticGatheringsModBlocks.CYAN_SHINGLES);
		LIGHT_BLUE_SHINGLES = block(MysticGatheringsModBlocks.LIGHT_BLUE_SHINGLES);
		BLUE_SHINGLES = block(MysticGatheringsModBlocks.BLUE_SHINGLES);
		PURPLE_SHINGLES = block(MysticGatheringsModBlocks.PURPLE_SHINGLES);
		MAGENTA_SHINGLES = block(MysticGatheringsModBlocks.MAGENTA_SHINGLES);
		PINK_SHINGLES = block(MysticGatheringsModBlocks.PINK_SHINGLES);
		FELDSPAR = block(MysticGatheringsModBlocks.FELDSPAR);
		POLISHED_FELDSPAR = block(MysticGatheringsModBlocks.POLISHED_FELDSPAR);
		FELDSPAR_BRICKS = block(MysticGatheringsModBlocks.FELDSPAR_BRICKS);
		FELDSPAR_PILLAR = block(MysticGatheringsModBlocks.FELDSPAR_PILLAR);
		CHISELED_FELDSPAR = block(MysticGatheringsModBlocks.CHISELED_FELDSPAR);
		FELDSPAR_BRICKS_SLAB = block(MysticGatheringsModBlocks.FELDSPAR_BRICKS_SLAB);
		POLISHED_FELDSPAR_SLAB = block(MysticGatheringsModBlocks.POLISHED_FELDSPAR_SLAB);
		FELDSPAR_SLAB = block(MysticGatheringsModBlocks.FELDSPAR_SLAB);
		FELDSPAR_BRICKS_STAIRS = block(MysticGatheringsModBlocks.FELDSPAR_BRICKS_STAIRS);
		POLISHED_FELDSPAR_STAIRS = block(MysticGatheringsModBlocks.POLISHED_FELDSPAR_STAIRS);
		FELDSPAR_STAIRS = block(MysticGatheringsModBlocks.FELDSPAR_STAIRS);
		FELDSPAR_BRICKS_WALL = block(MysticGatheringsModBlocks.FELDSPAR_BRICKS_WALL);
		POLISHED_FELDSPAR_WALL = block(MysticGatheringsModBlocks.POLISHED_FELDSPAR_WALL);
		FELDSPAR_WALL = block(MysticGatheringsModBlocks.FELDSPAR_WALL);
		FIR_LOG = block(MysticGatheringsModBlocks.FIR_LOG);
		FIR_WOOD = block(MysticGatheringsModBlocks.FIR_WOOD);
		STRIPPED_FIR_LOG = block(MysticGatheringsModBlocks.STRIPPED_FIR_LOG);
		STRIPPED_FIR_WOOD = block(MysticGatheringsModBlocks.STRIPPED_FIR_WOOD);
		FIR_PLANKS = block(MysticGatheringsModBlocks.FIR_PLANKS);
		FIR_STAIRS = block(MysticGatheringsModBlocks.FIR_STAIRS);
		FIR_SLAB = block(MysticGatheringsModBlocks.FIR_SLAB);
		FIR_FENCE = block(MysticGatheringsModBlocks.FIR_FENCE);
		FIR_FENCE_GATE = block(MysticGatheringsModBlocks.FIR_FENCE_GATE);
		FIR_DOOR = doubleBlock(MysticGatheringsModBlocks.FIR_DOOR);
		FIR_TRAPDOOR = block(MysticGatheringsModBlocks.FIR_TRAPDOOR);
		FIR_PRESSURE_PLATE = block(MysticGatheringsModBlocks.FIR_PRESSURE_PLATE);
		FIR_BUTTON = block(MysticGatheringsModBlocks.FIR_BUTTON);
		PEAT_SOIL = block(MysticGatheringsModBlocks.PEAT_SOIL);
		SPHAGNUM_MOSS = block(MysticGatheringsModBlocks.SPHAGNUM_MOSS);
		SPHAGNUM_MOSS_COVERED_PEAT = block(MysticGatheringsModBlocks.SPHAGNUM_MOSS_COVERED_PEAT);
		STATUE = block(MysticGatheringsModBlocks.STATUE);
		SPHAGNUM_MOSS_CARPET = block(MysticGatheringsModBlocks.SPHAGNUM_MOSS_CARPET);
		SPHAGNUM_MOSS_VINE = block(MysticGatheringsModBlocks.SPHAGNUM_MOSS_VINE);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new LeatherSackInventoryCapability(stack), LEATHER_SACK.get());
	}
}