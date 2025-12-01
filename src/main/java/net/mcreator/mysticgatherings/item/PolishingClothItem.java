package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class PolishingClothItem extends Item {
	public PolishingClothItem(Item.Properties properties) {
		super(properties.durability(24).setNoCombineRepair());
	}

	@Override
	public ItemStack getCraftingRemainder(ItemStack itemstack) {
		ItemStack retval = new ItemStack(this);
		retval.setDamageValue(itemstack.getDamageValue() + 1);
		if (retval.getDamageValue() >= retval.getMaxDamage()) {
			return ItemStack.EMPTY;
		}
		return retval;
	}
}