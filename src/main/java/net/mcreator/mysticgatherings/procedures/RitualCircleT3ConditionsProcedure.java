package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.init.MysticGatheringsModMenus;
import net.mcreator.mysticgatherings.init.MysticGatheringsModItems;
import net.mcreator.mysticgatherings.init.MysticGatheringsModBlocks;

public class RitualCircleT3ConditionsProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == MysticGatheringsModItems.ABARASH_INGOT
				.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(2).getItem() : ItemStack.EMPTY)
						.getItem() == MysticGatheringsModItems.POLISHED_MYSTIA_GEM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(3).getItem() : ItemStack.EMPTY)
						.getItem() == MysticGatheringsModItems.ABARASH_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(4).getItem() : ItemStack.EMPTY)
						.getItem() == MysticGatheringsModItems.POLISHED_MYSTIA_GEM.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu8 ? _menu8.getSlots().get(5).getItem() : ItemStack.EMPTY)
						.getItem() == MysticGatheringsModBlocks.TIER_2_RITUAL_CIRCLE.get().asItem();
	}
}