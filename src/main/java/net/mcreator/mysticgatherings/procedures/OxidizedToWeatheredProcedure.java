package net.mcreator.mysticgatherings.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.mysticgatherings.init.MysticGatheringsModBlocks;

public class OxidizedToWeatheredProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
				&& (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MysticGatheringsModBlocks.OXIDIZED_DREAL_BLOCK.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = MysticGatheringsModBlocks.WEATHERED_DREAL_BLOCK.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WAX_OFF, x, y, z, 10, 0, 0, 0, 4);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.HONEYCOMB
				&& (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MysticGatheringsModBlocks.OXIDIZED_DREAL_BLOCK.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = MysticGatheringsModBlocks.WAXED_OXIDIZED_DREAL_BLOCK.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WAX_ON, x, y, z, 10, 0, 0, 0, 4);
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() instanceof AxeItem
				&& (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == MysticGatheringsModBlocks.WAXED_OXIDIZED_DREAL_BLOCK.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = MysticGatheringsModBlocks.OXIDIZED_DREAL_BLOCK.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.WAX_OFF, x, y, z, 10, 0, 0, 0, 4);
		}
	}
}