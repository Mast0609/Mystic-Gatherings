package net.mcreator.mysticgatherings.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DrealAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 450, 8f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("mystic_gatherings:dreal_axe_repair_items")));

	public DrealAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 5f, -2f, properties);
	}
}