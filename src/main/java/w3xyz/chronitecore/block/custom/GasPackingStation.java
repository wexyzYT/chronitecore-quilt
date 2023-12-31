package w3xyz.chronitecore.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import w3xyz.chronitecore.block.entity.ModBlockEntities;

import java.lang.reflect.Type;
/*
public class GasPackingStation extends BlockWithEntity implements BlockEntityProvider {


	protected GasPackingStation(Settings settings) {
		super(settings);
	}

	@Nullable
	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {

		return new GasPackingStationBlockEntity(pos, state);
	}


	@Override
	public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof GasPackingStationBlockEntity) {
				ItemScatterer.spawn(world, pos, (GasPackingStationBlockEntity)blockEntity);
				world.updateComparators(pos,this);
			}
			super.onStateReplaced(state, world, pos, newState, moved);
		}
	}
	@Override
	public ActionResult onUse(BlockState state, World world, BlockPos pos,
							  PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (!world.isClient) {
			NamedScreenHandlerFactory screenHandlerFactory = state.createScreenHandlerFactory(world, pos);

			if (screenHandlerFactory != null) {
				player.openHandledScreen(screenHandlerFactory);
			}
		}

		return ActionResult.SUCCESS;
	}

	@Override
	public BlockRenderType getRenderType(BlockState state){
		return BlockRenderType.MODEL;
	}


	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
		return checkType(type, ModBlockEntities.GAS_PACKING_STATION, GasPackingStationBlockEntity::tick);
	}
}
*/
