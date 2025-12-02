package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.init.MysticGatheringsModMenus;
import net.mcreator.mysticgatherings.init.MysticGatheringsModItems;
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
		} else if (AgriumIngotConditionsProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
				ItemStack _setstack1 = new ItemStack(MysticGatheringsModItems.AGRIUM_INGOT.get()).copy();
				_setstack1.setCount(1);
				_menu.getSlots().get((int) outputSlot).set(_setstack1);
				_player.containerMenu.broadcastChanges();
			}
		} else if (BradishIngotConditionsProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
				ItemStack _setstack2 = new ItemStack(MysticGatheringsModItems.BRADISH_INGOT.get()).copy();
				_setstack2.setCount(1);
				_menu.getSlots().get((int) outputSlot).set(_setstack2);
				_player.containerMenu.broadcastChanges();
			}
		} else if (VeritaIngotConditionsProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
				ItemStack _setstack3 = new ItemStack(MysticGatheringsModItems.VERITA_INGOT.get()).copy();
				_setstack3.setCount(1);
				_menu.getSlots().get((int) outputSlot).set(_setstack3);
				_player.containerMenu.broadcastChanges();
			}
		} else if (CaldonIngotConditionsProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
				ItemStack _setstack4 = new ItemStack(MysticGatheringsModItems.CALDON_INGOT.get()).copy();
				_setstack4.setCount(1);
				_menu.getSlots().get((int) outputSlot).set(_setstack4);
				_player.containerMenu.broadcastChanges();
			}
		} else if (AbarashIngotConditionsProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
				ItemStack _setstack5 = new ItemStack(MysticGatheringsModItems.ABARASH_INGOT.get()).copy();
				_setstack5.setCount(1);
				_menu.getSlots().get((int) outputSlot).set(_setstack5);
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