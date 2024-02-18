package dev.ctm.calibry_materials.item.tools;

import dev.ctm.calibry_materials.CalibryMaterialsConfig;
import dev.ctm.calibry_materials.item.CalibryMaterialsItems;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags.Blocks;

public class ToolsTier {
    public static final ForgeTier SUBTANIUM_SWORD;
    public static final ForgeTier SUBTANIUM_TOOLS;

    public ToolsTier() {
    }

    static {
        SUBTANIUM_SWORD = new ForgeTier(CalibryMaterialsConfig.TOOLS.LEVEL.get(), CalibryMaterialsConfig.TOOLS.DURABILITY.get(), CalibryMaterialsConfig.TOOLS.SPEED.get(), CalibryMaterialsConfig.TOOLS.DAMAGE_SWORD.get(), CalibryMaterialsConfig.TOOLS.ENCHANTMENT.get(), Blocks.NEEDS_NETHERITE_TOOL, () -> {
            return Ingredient.of(new ItemLike[]{CalibryMaterialsItems.SUBTANIUM_INGOT.get()});
        });
        SUBTANIUM_TOOLS = new ForgeTier(CalibryMaterialsConfig.TOOLS.LEVEL.get(), CalibryMaterialsConfig.TOOLS.DURABILITY.get(), CalibryMaterialsConfig.TOOLS.SPEED.get(), CalibryMaterialsConfig.TOOLS.DAMAGE_TOOLS.get(), CalibryMaterialsConfig.TOOLS.ENCHANTMENT.get(), Blocks.NEEDS_NETHERITE_TOOL, () -> {
            return Ingredient.of(new ItemLike[]{CalibryMaterialsItems.SUBTANIUM_INGOT.get()});
        });
    }
}
