package dev.ctm.calibry_materials.item;

import dev.ctm.calibry_materials.CalibryMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class SubtaniumMaterials extends Item {
    public SubtaniumMaterials(int stack) {
        super((new Item.Properties()).stacksTo(stack).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    }
}
