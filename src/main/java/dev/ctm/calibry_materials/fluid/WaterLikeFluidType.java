package dev.ctm.calibry_materials.fluid;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraftforge.fluids.FluidType;

public class WaterLikeFluidType extends FluidType {
    public WaterLikeFluidType(Properties properties) {super(properties);}

    @Override
    public void setItemMovement(ItemEntity entity) {
        if(!entity.isNoGravity()) entity.setDeltaMovement(entity.getDeltaMovement().add(0.0D, -0.4D, 0.0D));
    }
}
