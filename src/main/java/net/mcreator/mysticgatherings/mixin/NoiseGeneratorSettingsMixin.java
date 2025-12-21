package net.mcreator.mysticgatherings.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.mysticgatherings.init.MysticGatheringsModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements MysticGatheringsModBiomes.MysticGatheringsModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> mystic_gatherings_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.mystic_gatherings_dimensionTypeReference != null) {
			retval = MysticGatheringsModBiomes.adaptSurfaceRule(retval, this.mystic_gatherings_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setmystic_gatheringsDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.mystic_gatherings_dimensionTypeReference = dimensionType;
	}
}