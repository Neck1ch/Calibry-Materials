package dev.ctm.calibry_materials.fluid;

import com.mojang.math.Vector3f;
import dev.ctm.calibry_materials.CalibryMaterials;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class CalibryTeamFluidRegistry {
    public static final DeferredRegister<FluidType> REGISTRY_TYPES = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, "calibry_materials");
    public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, "calibry_materials");
    public static final WaterLikeFluidType.Properties defaultFluidProperties = WaterLikeFluidType.Properties.create()
            .fallDistanceModifier(0F)
            .canExtinguish(true)
            .canConvertToSource(false)
            .supportsBoating(false)
            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
            .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
            .sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH)
            .motionScale(0.008f)
            .rarity(Rarity.EPIC)
            .lightLevel(12)
            .temperature(200)
            .canHydrate(false)
            .canPushEntity(true)
            .canSwim(true);
    public static final FluidRegistryContainer.AdditionalProperties defaultAdditionalProperties = new FluidRegistryContainer.AdditionalProperties(){};
    public static final Item.Properties defaultBucketProperties = new Item.Properties()
            .tab(CalibryMaterials.TAB)
            .rarity(Rarity.EPIC)
            .stacksTo(1)
            .craftRemainder(Items.BUCKET);

    /// REGISTER FLUIDS
    public static final FluidRegistryContainer SUBTANIUM_FLUID = new FluidRegistryContainer(
            "subtanium_fluid",
            defaultFluidProperties,
            0xD9FFFFFF,
            new Vector3f(14f / 255f, 14f / 255f, 9f / 255f),
            defaultAdditionalProperties,
            BlockBehaviour.Properties.copy(Blocks.WATER),
            defaultBucketProperties.tab(CalibryMaterials.TAB).rarity(Rarity.EPIC)
    );

    public static void register(IEventBus bus) {
        REGISTRY_TYPES.register(bus);
        REGISTRY.register(bus);
    }
}
