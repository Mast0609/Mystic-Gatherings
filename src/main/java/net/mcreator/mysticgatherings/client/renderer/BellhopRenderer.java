package net.mcreator.mysticgatherings.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.mysticgatherings.entity.BellhopEntity;
import net.mcreator.mysticgatherings.client.model.animations.MediumBellhopAnimation;
import net.mcreator.mysticgatherings.client.model.ModelMediumBellhop;

public class BellhopRenderer extends MobRenderer<BellhopEntity, LivingEntityRenderState, ModelMediumBellhop> {
	private BellhopEntity entity = null;

	public BellhopRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelMediumBellhop.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BellhopEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("mystic_gatherings:textures/entities/mediumbellhop.png");
	}

	private static final class AnimatedModel extends ModelMediumBellhop {
		private BellhopEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = MediumBellhopAnimation.Walkcycle.bake(root);
			this.keyframeAnimation1 = MediumBellhopAnimation.Idle.bake(root);
		}

		public void setEntity(BellhopEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}