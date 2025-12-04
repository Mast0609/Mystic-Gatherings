package net.mcreator.mysticgatherings.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.mysticgatherings.network.MysticGatheringsModVariables;
import net.mcreator.mysticgatherings.init.MysticGatheringsModItems;

public class T1ConsumeMystiaFuelProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia >= 100) {
			{
				MysticGatheringsModVariables.PlayerVariables _vars = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES);
				_vars.currentPlayerMystia = entity.getData(MysticGatheringsModVariables.PLAYER_VARIABLES).currentPlayerMystia - 100;
				_vars.markSyncDirty();
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(MysticGatheringsModItems.RAW_MYSTIA.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}