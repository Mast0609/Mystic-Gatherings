package net.mcreator.mysticgatherings.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.mysticgatherings.entity.SmallBellhopEntity;
import net.mcreator.mysticgatherings.client.model.animations.SmallBellhopAnimation;
import net.mcreator.mysticgatherings.client.model.ModelSmallBellhop;

import com.mojang.blaze3d.vertex.PoseStack;

public class SmallBellhopRenderer extends MobRenderer<SmallBellhopEntity, LivingEntityRenderState, ModelSmallBellhop> {
	private SmallBellhopEntity entity = null;

	public SmallBellhopRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSmallBellhop.LAYER_LOCATION)), 0.3f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SmallBellhopEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("mystic_gatherings:textures/entities/smallbellhop.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}

	private static final class AnimatedModel extends ModelSmallBellhop {
		private SmallBellhopEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = SmallBellhopAnimation.Walkcycle.bake(root);
			this.keyframeAnimation1 = SmallBellhopAnimation.Idle.bake(root);
		}

		public void setEntity(SmallBellhopEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 3f, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}