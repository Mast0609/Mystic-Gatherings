package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.init.MysticGatheringsModMenus;
import net.mcreator.mysticgatherings.init.MysticGatheringsModBlocks;

public class RecipesT1Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double outputSlot = 0;
		outputSlot = 4;
		if (RitualCircleT2ConditionsProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
				ItemStack _setstack0 = new ItemStack(MysticGatheringsModBlocks.TIER_2_RITUAL_CIRCLE.get()).copy();
				_setstack0.setCount(1);
				_menu.getSlots().get((int) outputSlot).set(_setstack0);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
				_menu.getSlots().get((int) outputSlot).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}