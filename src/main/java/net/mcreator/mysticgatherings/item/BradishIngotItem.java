package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BradishIngotItem extends Item {
	public BradishIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}