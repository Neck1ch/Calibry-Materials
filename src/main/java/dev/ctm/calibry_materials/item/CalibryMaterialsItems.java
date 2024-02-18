package dev.ctm.calibry_materials.item;

import dev.ctm.calibry_materials.CalibryMaterials;
import dev.ctm.calibry_materials.block.CalibryMaterialsBlocks;
import dev.ctm.calibry_materials.item.armor.SubtaniumArmor;
import dev.ctm.calibry_materials.item.tools.ToolsTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public interface CalibryMaterialsItems {
    DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, "calibry_materials");

    Supplier<Item> SUBTANIUM_SWORD = REGISTRY.register("subtanium_sword", () -> {
        return new SwordItem(ToolsTier.SUBTANIUM_SWORD, 1, 2, (new Item.Properties()).stacksTo(1).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    });
    Supplier<Item> SUBTANIUM_PICKAXE = REGISTRY.register("subtanium_pickaxe", () -> {
        return new PickaxeItem(ToolsTier.SUBTANIUM_TOOLS, -1, 2, (new Item.Properties()).stacksTo(1).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    });
    Supplier<Item> SUBTANIUM_AXE = REGISTRY.register("subtanium_axe", () -> {
        return new AxeItem(ToolsTier.SUBTANIUM_TOOLS, -1, 2, (new Item.Properties()).stacksTo(1).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    });
    Supplier<Item> SUBTANIUM_SHOVEL = REGISTRY.register("subtanium_shovel", () -> {
        return new ShovelItem(ToolsTier.SUBTANIUM_TOOLS, -1, 2, (new Item.Properties()).stacksTo(1).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    });
    Supplier<Item> SUBTANIUM_HOE = REGISTRY.register("subtanium_hoe", () -> {
        return new HoeItem(ToolsTier.SUBTANIUM_TOOLS, -1, 2, (new Item.Properties()).stacksTo(1).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    });

    Supplier<Item> SUBTANIUM_BOOTS = REGISTRY.register("subtanium_boots", () -> {
        return new ArmorItem(SubtaniumArmor.SUBTANIUM_ARMOR, EquipmentSlot.FEET, (new Item.Properties()).stacksTo(1).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    });
    Supplier<Item> SUBTANIUM_LEGGINGS = REGISTRY.register("subtanium_leggings", () -> {
        return new ArmorItem(SubtaniumArmor.SUBTANIUM_ARMOR, EquipmentSlot.LEGS, (new Item.Properties()).stacksTo(1).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    });
    Supplier<Item> SUBTANIUM_CHESTPLATE = REGISTRY.register("subtanium_chestplate", () -> {
        return new ArmorItem(SubtaniumArmor.SUBTANIUM_ARMOR, EquipmentSlot.CHEST, (new Item.Properties()).stacksTo(1).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    });
    Supplier<Item> SUBTANIUM_HELMET = REGISTRY.register("subtanium_helmet", () -> {
        return new ArmorItem(SubtaniumArmor.SUBTANIUM_ARMOR, EquipmentSlot.HEAD, (new Item.Properties()).stacksTo(1).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    });

    Supplier<Item> SUBTANIUM_UNIVERSE = REGISTRY.register("subtanium_universe", SubtaniumUniverse::new);
    Supplier<Item> SUBTANIUM_INGOT = REGISTRY.register("subtanium_ingot", () -> new SubtaniumMaterials(64));
    Supplier<Item> SUBTANIUM_NUGGET = REGISTRY.register("subtanium_nugget", () -> new SubtaniumMaterials(64));
    Supplier<Item> SUBTANIUM_ALLOY_DUST = REGISTRY.register("subtanium_alloy_dust", () -> new SubtaniumMaterials(64));
    Supplier<Item> SUBTANIUM_CRUSHED_ORE = REGISTRY.register("subtanium_crushed_ore", () -> new SubtaniumMaterials(64));
    Supplier<Item> SUBTANIUM_ALLOY_PLATE = REGISTRY.register("subtanium_alloy_plate", () -> new SubtaniumMaterials(64));

    Supplier<BlockItem> SUBTANIUM_BLOCK = blockItem("subtanium_block", CalibryMaterialsBlocks.SUBTANIUM_BLOCK);

    static Supplier<BlockItem> blockItem(String id, Supplier<Block> sup) {
        return REGISTRY.register(id, () -> {
            return new BlockItem((Block)sup.get(), (new Item.Properties()).tab(CalibryMaterials.TAB));
        });
    }
    static Supplier<Item> basicItem(String id) {
        return REGISTRY.register(id, () -> new Item((new Item.Properties()).tab(CalibryMaterials.TAB)));
    }
}
