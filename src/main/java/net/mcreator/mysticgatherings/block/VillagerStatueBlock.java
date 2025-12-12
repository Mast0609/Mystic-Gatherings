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
import net.minecraft.world.level.block.SoundType;
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

import net.mcreator.mysticgatherings.procedures.VillagerStatueBlockIsPlacedByProcedure;

public class VillagerStatueBlock extends Block {
	public static final IntegerProperty BLOCKSTATE = IntegerProperty.create("blockstate", 0, 2);
	public static final EnumProperty<Direction> FACING = HorizontalDirectionalBlock.FACING;

	public VillagerStatueBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(1f, 10f).lightLevel(s -> (new Object() {
			public int getLightLevel() {
				if (s.getValue(BLOCKSTATE) == 1)
					return 0;
				if (s.getValue(BLOCKSTATE) == 2)
					return 0;
				return 0;
			}
		}.getLightLevel())).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		if (state.getValue(BLOCKSTATE) == 1) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(4, 0, 4, 12, 15, 11), box(2, -3, 7, 14, 4, 11), box(7, 5, 11, 9, 10, 13));
				case NORTH -> Shapes.or(box(4, 0, 5, 12, 15, 12), box(2, -3, 5, 14, 4, 9), box(7, 5, 3, 9, 10, 5));
				case EAST -> Shapes.or(box(4, 0, 4, 11, 15, 12), box(7, -3, 2, 11, 4, 14), box(11, 5, 7, 13, 10, 9));
				case WEST -> Shapes.or(box(5, 0, 4, 12, 15, 12), box(5, -3, 2, 9, 4, 14), box(3, 5, 7, 5, 10, 9));
			};
		}
		if (state.getValue(BLOCKSTATE) == 2) {
			return switch (state.getValue(FACING)) {
				default -> Shapes.or(box(5, 18, 5, 11, 24, 11), box(5, 8, 7, 11, 18, 9), box(3, 8, 7, 5, 18, 9), box(11, 8, 7, 13, 18, 9), box(5.1, 0, 7, 7.1, 8, 9), box(8.9, 0, 7, 10.9, 8, 9));
				case NORTH -> Shapes.or(box(5, 18, 5, 11, 24, 11), box(5, 8, 7, 11, 18, 9), box(11, 8, 7, 13, 18, 9), box(3, 8, 7, 5, 18, 9), box(8.9, 0, 7, 10.9, 8, 9), box(5.1, 0, 7, 7.1, 8, 9));
				case EAST -> Shapes.or(box(5, 18, 5, 11, 24, 11), box(7, 8, 5, 9, 18, 11), box(7, 8, 11, 9, 18, 13), box(7, 8, 3, 9, 18, 5), box(7, 0, 8.9, 9, 8, 10.9), box(7, 0, 5.1, 9, 8, 7.1));
				case WEST -> Shapes.or(box(5, 18, 5, 11, 24, 11), box(7, 8, 5, 9, 18, 11), box(7, 8, 3, 9, 18, 5), box(7, 8, 11, 9, 18, 13), box(7, 0, 5.1, 9, 8, 7.1), box(7, 0, 8.9, 9, 8, 10.9));
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
		VillagerStatueBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
		super.setPlacedBy(world, pos, blockstate, entity, itemstack);
		VillagerStatueBlockIsPlacedByProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}