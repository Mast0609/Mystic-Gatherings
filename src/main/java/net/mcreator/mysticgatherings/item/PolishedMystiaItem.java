package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PolishedMystiaItem extends Item {
	public PolishedMystiaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}