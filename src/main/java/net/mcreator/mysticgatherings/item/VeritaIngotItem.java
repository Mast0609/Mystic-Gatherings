package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class VeritaIngotItem extends Item {
	public VeritaIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}