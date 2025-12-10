/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mysticgatherings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mysticgatherings.entity.SmallBellhopEntity;
import net.mcreator.mysticgatherings.entity.BellhopEntity;
import net.mcreator.mysticgatherings.MysticGatheringsMod;

@EventBusSubscriber
public class MysticGatheringsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MysticGatheringsMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<BellhopEntity>> MEDIUMBELLHOP = register("mediumbellhop",
			EntityType.Builder.<BellhopEntity>of(BellhopEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.6f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<SmallBellhopEntity>> SMALL_BELLHOP = register("small_bellhop",
			EntityType.Builder.<SmallBellhopEntity>of(SmallBellhopEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune()

					.sized(0.3f, 0.75f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(MysticGatheringsMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		BellhopEntity.init(event);
		SmallBellhopEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MEDIUMBELLHOP.get(), BellhopEntity.createAttributes().build());
		event.put(SMALL_BELLHOP.get(), SmallBellhopEntity.createAttributes().build());
	}
}