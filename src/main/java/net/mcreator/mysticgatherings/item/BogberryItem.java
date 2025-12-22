package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BogberryItem extends Item {
	public BogberryItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.6f).build()));
	}
}