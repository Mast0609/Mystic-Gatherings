package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawMystiaItem extends Item {
	public RawMystiaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}