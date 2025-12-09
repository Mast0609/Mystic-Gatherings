package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CondensedMystiaPearlItem extends Item {
	public CondensedMystiaPearlItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}