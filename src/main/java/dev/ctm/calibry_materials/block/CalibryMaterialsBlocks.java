package dev.ctm.calibry_materials.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public interface CalibryMaterialsBlocks {
    DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, "calibry_materials");
    Supplier<Block> SUBTANIUM_BLOCK = REGISTRY.register("subtanium_block", () -> {
        return new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.AMETHYST).strength(5.0F, 1.0E10F).color(MaterialColor.COLOR_PURPLE).requiresCorrectToolForDrops());
    });

    static void init() {
    }
}