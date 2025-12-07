package net.mcreator.mysticgatherings.item.inventory;

import net.neoforged.neoforge.items.ComponentItemHandler;
import net.neoforged.neoforge.event.entity.item.ItemTossEvent;
import net.neoforged.neoforge.common.MutableDataComponentHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.component.DataComponents;

import net.mcreator.mysticgatherings.world.inventory.LeatherSackInventoryMenu;
import net.mcreator.mysticgatherings.init.MysticGatheringsModItems;

import javax.annotation.Nonnull;

@EventBusSubscriber
public class LeatherSackInventoryCapability extends ComponentItemHandler {
	@SubscribeEvent
	public static void onItemDropped(ItemTossEvent event) {
		if (event.getEntity().getItem().getItem() == MysticGatheringsModItems.LEATHER_SACK.get()) {
			Player player = event.getPlayer();
			if (player.containerMenu instanceof LeatherSackInventoryMenu)
				player.closeContainer();
		}
	}

	public LeatherSackInventoryCapability(MutableDataComponentHolder parent) {
		super(parent, DataComponents.CONTAINER, 27);
	}

	@Override
	public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
		return stack.getItem() != MysticGatheringsModItems.LEATHER_SACK.get();
	}

	@Override
	public ItemStack getStackInSlot(int slot) {
		return super.getStackInSlot(slot).copy();
	}
}