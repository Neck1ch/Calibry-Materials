package dev.ctm.calibry_materials;

import dev.ftb.mods.ftblibrary.snbt.config.IntValue;
import dev.ftb.mods.ftblibrary.snbt.config.SNBTConfig;

public class CalibryMaterialsConfig
{
    public static SNBTConfig CONFIG = (SNBTConfig)SNBTConfig.create("calibry_materials").comment(new String[]{"Calibry Materials config file"});
    public static final Tools TOOLS;
    public static final Armor ARMOR;

    public CalibryMaterialsConfig() {
    }

    public static void init() {
    }

    static {
        TOOLS = new Tools();
        ARMOR = new Armor();
    }

    public static final class Tools {
        private static final SNBTConfig TOOLS;
        public IntValue LEVEL;
        public IntValue SPEED;
        public IntValue DURABILITY;
        public IntValue DAMAGE_SWORD;
        public IntValue DAMAGE_TOOLS;
        public IntValue ENCHANTMENT;

        public Tools() {
            this.LEVEL = (IntValue) TOOLS.getInt("Level", 5).comment(new String[]{"Level Subtanium Tools"});
            this.SPEED = (IntValue) TOOLS.getInt("Speed", 4096).comment(new String[]{"Speed Subtanium Tools"});
            this.DURABILITY = (IntValue) TOOLS.getInt("Durability", -1).comment(new String[]{"Durability Subtanium Tools"});
            this.DAMAGE_SWORD = (IntValue) TOOLS.getInt("DamageSword", 80).comment(new String[]{"Damage Subtanium Sword"});
            this.DAMAGE_TOOLS = (IntValue) TOOLS.getInt("DamageTools", 12).comment(new String[]{"Damage Subtanium Tools"});
            this.ENCHANTMENT = (IntValue) TOOLS.getInt("Enchantment", 20).comment(new String[]{"Enchantment Subtanium Tools"});
        }
        static {
            TOOLS = CalibryMaterialsConfig.CONFIG.getGroup("Tools");
        }
    }

    public static final class Armor {
        private static final SNBTConfig ARMOR;
        public IntValue BOOTS_DURABILITY;
        public IntValue LEGGINGS_DURABILITY;
        public IntValue CHESTPLATE_DURABILITY;
        public IntValue HELMET_DURABILITY;
        public IntValue BOOTS_PROTECTION;
        public IntValue LEGGINGS_PROTECTION;
        public IntValue CHESTPLATE_PROTECTION;
        public IntValue HELMET_PROTECTION;

        public Armor() {
            this.BOOTS_DURABILITY = (IntValue) ARMOR.getInt("BootsDurability", -1).comment(new String[]{"Durability Subtanium Boots"});
            this.LEGGINGS_DURABILITY = (IntValue) ARMOR.getInt("LeggingsDurability", -1).comment(new String[]{"Durability Subtanium Leggings"});
            this.CHESTPLATE_DURABILITY = (IntValue) ARMOR.getInt("ChestplateDurability", -1).comment(new String[]{"Durability Subtanium Chestplate"});
            this.HELMET_DURABILITY = (IntValue) ARMOR.getInt("HelmetDurability", -1).comment(new String[]{"Durability Subtanium Helmet"});

            this.BOOTS_PROTECTION = (IntValue) ARMOR.getInt("BootsProtection", 30).comment(new String[]{"Protection Subtanium Boots"});
            this.LEGGINGS_PROTECTION = (IntValue) ARMOR.getInt("LeggingsProtection", 60).comment(new String[]{"Protection Subtanium Leggings"});
            this.CHESTPLATE_PROTECTION = (IntValue) ARMOR.getInt("ChestplateProtection", 80).comment(new String[]{"Protection Subtanium Chestplate"});
            this.HELMET_PROTECTION = (IntValue) ARMOR.getInt("HelmetProtection", 30).comment(new String[]{"Protection Subtanium Helmet"});
        }
        static {
            ARMOR = CalibryMaterialsConfig.CONFIG.getGroup("Armor");
        }
    }
}
