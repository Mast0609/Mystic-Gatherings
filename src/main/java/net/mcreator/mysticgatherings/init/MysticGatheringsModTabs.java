/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mysticgatherings.MysticGatheringsMod;

@EventBusSubscriber
public class MysticGatheringsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysticGatheringsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MYSTIC_GATHERINGS = REGISTRY.register("mystic_gatherings",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mystic_gatherings.mystic_gatherings")).icon(() -> new ItemStack(MysticGatheringsModItems.RAW_ORPH.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MysticGatheringsModItems.RAW_ORPH.get());
				tabData.accept(MysticGatheringsModBlocks.STONE_ORPH_ORE.get().asItem());
				tabData.accept(MysticGatheringsModItems.ORPH_INGOT.get());
				tabData.accept(MysticGatheringsModBlocks.ORPH_BLOCK.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.DEEPSLATE_ORPH_ORE.get().asItem());
				tabData.accept(MysticGatheringsModItems.RAW_DREAL.get());
				tabData.accept(MysticGatheringsModItems.DREAL_INGOT.get());
				tabData.accept(MysticGatheringsModBlocks.STONE_DREAL_ORE.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.DEEPSLATE_DREAL_ORE.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.DREAL_BLOCK.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.WEATHERED_DREAL_BLOCK.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.OXIDIZED_DREAL_BLOCK.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.WAXED_DREAL_BLOCK.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.WAXED_WEATHERED_DREAL_BLOCK.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.WAXED_OXIDIZED_DREAL_BLOCK.get().asItem());
				tabData.accept(MysticGatheringsModItems.RAW_MYSTIA_GEM.get());
				tabData.accept(MysticGatheringsModBlocks.MYSTIA_ORE.get().asItem());
				tabData.accept(MysticGatheringsModItems.POLISHING_CLOTH.get());
				tabData.accept(MysticGatheringsModItems.POLISHED_MYSTIA_GEM.get());
				tabData.accept(MysticGatheringsModBlocks.MYSTIA_BLOCK.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.TIER_1_RITUAL_CIRCLE.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.TIER_2_RITUAL_CIRCLE.get().asItem());
				tabData.accept(MysticGatheringsModItems.AGRIUM_INGOT.get());
				tabData.accept(MysticGatheringsModItems.CALDON_INGOT.get());
				tabData.accept(MysticGatheringsModItems.ABARASH_INGOT.get());
				tabData.accept(MysticGatheringsModItems.VERITA_INGOT.get());
				tabData.accept(MysticGatheringsModItems.BRADISH_INGOT.get());
				tabData.accept(MysticGatheringsModItems.ORPH_ARMOR_HELMET.get());
				tabData.accept(MysticGatheringsModItems.ORPH_ARMOR_CHESTPLATE.get());
				tabData.accept(MysticGatheringsModItems.ORPH_ARMOR_LEGGINGS.get());
				tabData.accept(MysticGatheringsModItems.ORPH_ARMOR_BOOTS.get());
				tabData.accept(MysticGatheringsModBlocks.VERAWOOD_LOG.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.STRIPPED_VERAWOOD_LOG.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.STRIPPED_VERAWOOD_WOOD.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.VERAWOOD_WOOD.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.VERAWOOD_PLANKS.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.VERAWOOD_LEAVES.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.VERAWOOD_SAPLING.get().asItem());
				tabData.accept(MysticGatheringsModItems.LEATHER_SACK.get());
				tabData.accept(MysticGatheringsModBlocks.TIER_3_RITUAL_CIRCLE.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.T_1_RITUAL_CANDLE.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.T_2_RITUAL_CANDLE.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.T_3_RITUAL_CANDLE.get().asItem());
				tabData.accept(MysticGatheringsModBlocks.STONE_CONDENSED_MYSTIA_ORE.get().asItem());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(MysticGatheringsModBlocks.STONE_ORPH_ORE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.DEEPSLATE_ORPH_ORE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.STONE_DREAL_ORE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.DEEPSLATE_DREAL_ORE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.MYSTIA_ORE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.VERAWOOD_LOG.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.STRIPPED_VERAWOOD_LOG.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.STRIPPED_VERAWOOD_WOOD.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.VERAWOOD_WOOD.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.VERAWOOD_LEAVES.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.VERAWOOD_SAPLING.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.STONE_CONDENSED_MYSTIA_ORE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(MysticGatheringsModBlocks.ORPH_BLOCK.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.DREAL_BLOCK.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.WEATHERED_DREAL_BLOCK.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.OXIDIZED_DREAL_BLOCK.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.WAXED_DREAL_BLOCK.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.WAXED_WEATHERED_DREAL_BLOCK.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.WAXED_OXIDIZED_DREAL_BLOCK.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.MYSTIA_BLOCK.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.VERAWOOD_PLANKS.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.T_1_RITUAL_CANDLE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.T_2_RITUAL_CANDLE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.T_3_RITUAL_CANDLE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MysticGatheringsModItems.POLISHING_CLOTH.get());
			tabData.accept(MysticGatheringsModItems.LEATHER_SACK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(MysticGatheringsModBlocks.TIER_1_RITUAL_CIRCLE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.TIER_2_RITUAL_CIRCLE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.TIER_3_RITUAL_CIRCLE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.T_1_RITUAL_CANDLE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.T_2_RITUAL_CANDLE.get().asItem());
			tabData.accept(MysticGatheringsModBlocks.T_3_RITUAL_CANDLE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MysticGatheringsModItems.ORPH_ARMOR_HELMET.get());
			tabData.accept(MysticGatheringsModItems.ORPH_ARMOR_CHESTPLATE.get());
			tabData.accept(MysticGatheringsModItems.ORPH_ARMOR_LEGGINGS.get());
			tabData.accept(MysticGatheringsModItems.ORPH_ARMOR_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MysticGatheringsModItems.RAW_ORPH.get());
			tabData.accept(MysticGatheringsModItems.ORPH_INGOT.get());
			tabData.accept(MysticGatheringsModItems.RAW_DREAL.get());
			tabData.accept(MysticGatheringsModItems.DREAL_INGOT.get());
			tabData.accept(MysticGatheringsModItems.AGRIUM_INGOT.get());
			tabData.accept(MysticGatheringsModItems.BRADISH_INGOT.get());
			tabData.accept(MysticGatheringsModItems.VERITA_INGOT.get());
			tabData.accept(MysticGatheringsModItems.CALDON_INGOT.get());
			tabData.accept(MysticGatheringsModItems.ABARASH_INGOT.get());
			tabData.accept(MysticGatheringsModItems.RAW_MYSTIA_GEM.get());
			tabData.accept(MysticGatheringsModItems.POLISHED_MYSTIA_GEM.get());
		}
	}
}