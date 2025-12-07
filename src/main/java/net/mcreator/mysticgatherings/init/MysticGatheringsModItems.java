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
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
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

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new LeatherSackInventoryCapability(stack), LEATHER_SACK.get());
	}
}