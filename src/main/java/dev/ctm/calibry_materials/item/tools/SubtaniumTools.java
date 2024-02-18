package dev.ctm.calibry_materials.item.tools;

import dev.ctm.calibry_materials.CalibryMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class SubtaniumTools extends Item {
    public SubtaniumTools(int stack) {
        super((new Item.Properties()).stacksTo(stack).rarity(Rarity.EPIC).tab(CalibryMaterials.TAB));
    }
}
