/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mysticgatherings.item.*;
import net.mcreator.mysticgatherings.MysticGatheringsMod;

import java.util.function.Function;

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
	public static final DeferredItem<Item> RAW_MYSTIA;
	public static final DeferredItem<Item> MYSTIA_ORE;
	public static final DeferredItem<Item> POLISHING_CLOTH;
	public static final DeferredItem<Item> POLISHED_MYSTIA;
	public static final DeferredItem<Item> MYSTIA_BLOCK;
	public static final DeferredItem<Item> TIER_1_RITUAL_CIRCLE;
	public static final DeferredItem<Item> TIER_2_RITUAL_CIRCLE;
	public static final DeferredItem<Item> AGRIUM_INGOT;
	public static final DeferredItem<Item> CALDON_INGOT;
	public static final DeferredItem<Item> ABARASH_INGOT;
	public static final DeferredItem<Item> VERITA_INGOT;
	public static final DeferredItem<Item> BRADISH_INGOT;
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
		RAW_MYSTIA = register("raw_mystia", RawMystiaItem::new);
		MYSTIA_ORE = block(MysticGatheringsModBlocks.MYSTIA_ORE, new Item.Properties().rarity(Rarity.RARE));
		POLISHING_CLOTH = register("polishing_cloth", PolishingClothItem::new);
		POLISHED_MYSTIA = register("polished_mystia", PolishedMystiaItem::new);
		MYSTIA_BLOCK = block(MysticGatheringsModBlocks.MYSTIA_BLOCK, new Item.Properties().rarity(Rarity.RARE));
		TIER_1_RITUAL_CIRCLE = block(MysticGatheringsModBlocks.TIER_1_RITUAL_CIRCLE, new Item.Properties().rarity(Rarity.RARE));
		TIER_2_RITUAL_CIRCLE = block(MysticGatheringsModBlocks.TIER_2_RITUAL_CIRCLE, new Item.Properties().rarity(Rarity.EPIC));
		AGRIUM_INGOT = register("agrium_ingot", AgriumIngotItem::new);
		CALDON_INGOT = register("caldon_ingot", CaldonIngotItem::new);
		ABARASH_INGOT = register("abarash_ingot", AbarashIngotItem::new);
		VERITA_INGOT = register("verita_ingot", VeritaIngotItem::new);
		BRADISH_INGOT = register("bradish_ingot", BradishIngotItem::new);
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
}