package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CaldonIngotItem extends Item {
	public CaldonIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}