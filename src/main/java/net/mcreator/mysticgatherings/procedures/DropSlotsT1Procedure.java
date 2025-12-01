package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.init.MysticGatheringsModMenus;

public class DropSlotsT1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
			_menu.getSlots().get(4).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
	}
}