package net.mcreator.mysticgatherings.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.mysticgatherings.procedures.SwitchStatueVariantProcedure;

public class StatueBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 2);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public StatueBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 12f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				return 0;
			}
		}.getLightLevel())).requiresCorrectToolForDrops());
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2, 0, 2, 14, 2, 14), box(3, 2, 3, 13, 3, 13), box(1, 3, 1, 15, 5, 15), box(4, 5, 4, 12, 21, 11), box(1, 3, 7, 15, 11, 11), box(7, 11, 11, 9, 16, 13));
				case NORTH -> Shapes.or(box(2, 0, 2, 14, 2, 14), box(3, 2, 3, 13, 3, 13), box(1, 3, 1, 15, 5, 15), box(4, 5, 5, 12, 21, 12), box(1, 3, 5, 15, 11, 9), box(7, 11, 3, 9, 16, 5));
				case EAST -> Shapes.or(box(2, 0, 2, 14, 2, 14), box(3, 2, 3, 13, 3, 13), box(1, 3, 1, 15, 5, 15), box(4, 5, 4, 11, 21, 12), box(7, 3, 1, 11, 11, 15), box(11, 11, 7, 13, 16, 9));
				case WEST -> Shapes.or(box(2, 0, 2, 14, 2, 14), box(3, 2, 3, 13, 3, 13), box(1, 3, 1, 15, 5, 15), box(5, 5, 4, 12, 21, 12), box(5, 3, 1, 9, 11, 15), box(3, 11, 7, 5, 16, 9));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(2, 0, 2, 14, 2, 14), box(3, 2, 3, 13, 3, 13), box(1, 3, 1, 15, 5, 15), box(5, 11.5, 12, 11, 17.5, 16), box(5, 17.5, 13, 7, 19.5, 14), box(9, 17.5, 13, 11, 19.5, 14), box(6.5, 11.51563, 15, 9.5, 14.51563, 19),
						box(5, 14, 1, 11, 20, 9), box(4, 10.5, 8, 12, 17.5, 14), box(9, 5, 11, 11, 11, 13), box(8.5, 5, 4.5, 10.5, 7, 10.5), box(5.5, 5, 4.5, 7.5, 7, 10.5), box(5, 5, 11, 7, 11, 13), box(7, 7, -4, 9, 9, 2));
				case NORTH -> Shapes.or(box(2, 0, 2, 14, 2, 14), box(3, 2, 3, 13, 3, 13), box(1, 3, 1, 15, 5, 15), box(5, 11.5, 0, 11, 17.5, 4), box(9, 17.5, 2, 11, 19.5, 3), box(5, 17.5, 2, 7, 19.5, 3), box(6.5, 11.51563, -3, 9.5, 14.51563, 1),
						box(5, 14, 7, 11, 20, 15), box(4, 10.5, 2, 12, 17.5, 8), box(5, 5, 3, 7, 11, 5), box(5.5, 5, 5.5, 7.5, 7, 11.5), box(8.5, 5, 5.5, 10.5, 7, 11.5), box(9, 5, 3, 11, 11, 5), box(7, 7, 14, 9, 9, 20));
				case EAST ->
					Shapes.or(box(2, 0, 2, 14, 2, 14), box(3, 2, 3, 13, 3, 13), box(1, 3, 1, 15, 5, 15), box(12, 11.5, 5, 16, 17.5, 11), box(13, 17.5, 9, 14, 19.5, 11), box(13, 17.5, 5, 14, 19.5, 7), box(15, 11.51563, 6.5, 19, 14.51563, 9.5),
							box(1, 14, 5, 9, 20, 11), box(8, 10.5, 4, 14, 17.5, 12), box(11, 5, 5, 13, 11, 7), box(4.5, 5, 5.5, 10.5, 7, 7.5), box(4.5, 5, 8.5, 10.5, 7, 10.5), box(11, 5, 9, 13, 11, 11), box(-4, 7, 7, 2, 9, 9));
				case WEST -> Shapes.or(box(2, 0, 2, 14, 2, 14), box(3, 2, 3, 13, 3, 13), box(1, 3, 1, 15, 5, 15), box(0, 11.5, 5, 4, 17.5, 11), box(2, 17.5, 5, 3, 19.5, 7), box(2, 17.5, 9, 3, 19.5, 11), box(-3, 11.51563, 6.5, 1, 14.51563, 9.5),
						box(7, 14, 5, 15, 20, 11), box(2, 10.5, 4, 8, 17.5, 12), box(3, 5, 9, 5, 11, 11), box(5.5, 5, 8.5, 11.5, 7, 10.5), box(5.5, 5, 5.5, 11.5, 7, 7.5), box(3, 5, 5, 5, 11, 7), box(14, 7, 7, 20, 9, 9));
			};
		}
		return switch (state.getValue(FACING)) {
			default -> box(0, 0, 0, 16, 16, 16);
			case NORTH -> box(0, 0, 0, 16, 16, 16);
			case EAST -> box(0, 0, 0, 16, 16, 16);
			case WEST -> box(0, 0, 0, 16, 16, 16);
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING, BLOCKSTATE);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return super.getStateForPlacement(context).setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		SwitchStatueVariantProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		SwitchStatueVariantProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}