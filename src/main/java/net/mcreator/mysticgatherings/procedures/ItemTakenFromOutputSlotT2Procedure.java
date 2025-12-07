package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.init.MysticGatheringsModMenus;

public class ItemTakenFromOutputSlotT2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double slot = 0;
		slot = 1;
		for (int index0 = 0; index0 < 5; index0++) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
				_menu.getSlots().get((int) slot).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			slot = slot + 1;
		}
	}
}