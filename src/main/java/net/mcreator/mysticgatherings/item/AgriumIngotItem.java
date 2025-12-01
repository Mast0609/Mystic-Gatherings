package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AgriumIngotItem extends Item {
	public AgriumIngotItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}