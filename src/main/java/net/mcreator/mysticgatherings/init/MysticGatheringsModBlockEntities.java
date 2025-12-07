/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.mysticgatherings.block.entity.Tier3RitualCircleBlockEntity;
import net.mcreator.mysticgatherings.block.entity.Tier2RitualCircleBlockEntity;
import net.mcreator.mysticgatherings.block.entity.Tier1RitualCircleBlockEntity;
import net.mcreator.mysticgatherings.MysticGatheringsMod;

@EventBusSubscriber
public class MysticGatheringsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MysticGatheringsMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Tier1RitualCircleBlockEntity>> TIER_1_RITUAL_CIRCLE = register("tier_1_ritual_circle", MysticGatheringsModBlocks.TIER_1_RITUAL_CIRCLE, Tier1RitualCircleBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Tier2RitualCircleBlockEntity>> TIER_2_RITUAL_CIRCLE = register("tier_2_ritual_circle", MysticGatheringsModBlocks.TIER_2_RITUAL_CIRCLE, Tier2RitualCircleBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<Tier3RitualCircleBlockEntity>> TIER_3_RITUAL_CIRCLE = register("tier_3_ritual_circle", MysticGatheringsModBlocks.TIER_3_RITUAL_CIRCLE, Tier3RitualCircleBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<T> supplier) {
		return REGISTRY.register(registryname, () -> new BlockEntityType(supplier, block.get()));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TIER_1_RITUAL_CIRCLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TIER_2_RITUAL_CIRCLE.get(), SidedInvWrapper::new);
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, TIER_3_RITUAL_CIRCLE.get(), SidedInvWrapper::new);
	}
}