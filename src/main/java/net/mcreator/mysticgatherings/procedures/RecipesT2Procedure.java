package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.mysticgatherings.init.MysticGatheringsModMenus;
import net.mcreator.mysticgatherings.init.MysticGatheringsModBlocks;

public class RecipesT2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double outputSlot = 0;
		outputSlot = 6;
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "activationTimer") > 0) {
			if (RitualCircleT3ConditionsProcedure.execute(entity)) {
				if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
					ItemStack _setstack1 = new ItemStack(MysticGatheringsModBlocks.TIER_3_RITUAL_CIRCLE.get()).copy();
					_setstack1.setCount(1);
					_menu.getSlots().get((int) outputSlot).set(_setstack1);
					_player.containerMenu.broadcastChanges();
				}
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof MysticGatheringsModMenus.MenuAccessor _menu) {
				_menu.getSlots().get((int) outputSlot).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}