package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.init.MysticGatheringsModMenus;
import net.mcreator.mysticgatherings.init.MysticGatheringsModItems;

public class AgriumIngotConditionsProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == MysticGatheringsModItems.ORPH_INGOT.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.IRON_INGOT
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == MysticGatheringsModItems.DREAL_INGOT
						.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(3).getItem() : ItemStack.EMPTY)
						.getItem() == MysticGatheringsModItems.POLISHED_MYSTIA.get();
	}
}