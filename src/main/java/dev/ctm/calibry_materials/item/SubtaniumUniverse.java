package dev.ctm.calibry_materials.item;

import dev.ctm.calibry_materials.CalibryMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class SubtaniumUniverse extends Item {
    public SubtaniumUniverse() {
        super((new Item.Properties()).stacksTo(4).rarity(Rarity.EPIC).fireResistant().tab(CalibryMaterials.TAB));
    }
}
