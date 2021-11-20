package net.damqn4etobg.oresplus.item;

import net.damqn4etobg.oresplus.OresPlus;
import net.damqn4etobg.oresplus.block.ModBlocks;
import net.damqn4etobg.oresplus.item.custom.ModArmorItem;
import net.damqn4etobg.oresplus.item.custom.ModAxeItem;
import net.damqn4etobg.oresplus.item.custom.ModHoeItem;
import net.damqn4etobg.oresplus.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSGROUP)));

    public static final Item ENPOWERED_CRYSTAL_SHARD = registerItem("enpowered_crystal_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSGROUP)));

    public static final Item ENPOWRED_OBXIDIAN_INGOT = registerItem("enpowered_obxidian_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSGROUP)));

    public static final Item ENPOWERED_OBXIDIAN_DUST = registerItem("enpowered_obxidian_dust",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSGROUP)));

    public static final Item ALUMINIUM_INGOT = registerItem("aluminium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSGROUP)));

    public static final Item URANIUM_INGOT = registerItem("uranium_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSGROUP)));

    public static final Item IRON_PLATE = registerItem("iron_plate",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSENGINEERINGGROUP)));

    public static final Item RADIOACTIVE_GENERATOR_CORE = registerItem("radioactive_generator_core",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSENGINEERINGGROUP).fireproof()));

    public static final Item CIRCUIT_BOARD = registerItem("circuit_board",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSENGINEERINGGROUP)));

    public static final Item ADVANCED_CIRCUIT_BOARD = registerItem("advanced_circuit_board",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSENGINEERINGGROUP)));

    public static final Item CORN = registerItem("corn",
            new BlockItem(ModBlocks.CORN_CROP, new FabricItemSettings().group(ModItemGroup.ORESPLUSFARMGROUP)
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.25f).alwaysEdible().snack().build())));

    public static final Item TOMATO = registerItem("tomato",
            new BlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings().group(ModItemGroup.ORESPLUSFARMGROUP)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.5f).alwaysEdible().snack().build())));



    public static final Item RUBY_SWORD = registerItem("ruby_sword",
            new SwordItem(ModToolMaterial.RUBY, 7, 0.5f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe",
            new ModPickaxeItem(ModToolMaterial.RUBY, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item RUBY_AXE = registerItem("ruby_axe",
            new ModAxeItem(ModToolMaterial.RUBY, 10, 0.25f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item RUBY_SHOVEL = registerItem("ruby_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 0, 1f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item RUBY_HOE = registerItem("ruby_hoe",
            new ModHoeItem(ModToolMaterial.RUBY, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item ENPOWERED_OBXIDIAN_SWORD = registerItem("enpowered_obxidian_sword",
            new SwordItem(ModToolMaterial.RUBY, 12, 0.5f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item ENPOWERED_OBXIDIAN_PICKAXE = registerItem("enpowered_obxidian_pickaxe",
            new ModPickaxeItem(ModToolMaterial.RUBY, 3, 1f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item ENPOWERED_OBXIDIAN_AXE = registerItem("enpowered_obxidian_axe",
            new ModAxeItem(ModToolMaterial.RUBY, 24, 0.25f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item ENPOWERED_OBXIDIAN_SHOVEL = registerItem("enpowered_obxidian_shovel",
            new ShovelItem(ModToolMaterial.RUBY, 2, 1f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item ENPOWERED_OBXIDIAN_HOE = registerItem("enpowered_obxidian_hoe",
            new ModHoeItem(ModToolMaterial.RUBY, 1, 1f,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSTOOLSGROUP)));

    public static final Item RUBY_HELMET = registerItem("ruby_helmet",
            new ModArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSARMORGROUP)));

    public static final Item RUBY_CHESTPLATE = registerItem("ruby_chestplate",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSARMORGROUP)));

    public static final Item RUBY_LEGGINGS = registerItem("ruby_leggings",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSARMORGROUP)));

    public static final Item RUBY_BOOTS = registerItem("ruby_boots",
            new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSARMORGROUP)));

    public static final Item ENPOWRED_OBXIDIAN_HELMET = registerItem("enpowered_obxidian_helmet",
            new ModArmorItem(ModArmorMaterial.ENPOWERED_OBXIDIAN, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSARMORGROUP)));

    public static final Item ENPOWRED_OBXIDIAN_CHESTPLATE = registerItem("enpowered_obxidian_chestplate",
            new ArmorItem(ModArmorMaterial.ENPOWERED_OBXIDIAN, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSARMORGROUP)));

    public static final Item ENPOWRED_OBXIDIAN_LEGGINGS = registerItem("enpowered_obxidian_leggings",
            new ArmorItem(ModArmorMaterial.ENPOWERED_OBXIDIAN, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSARMORGROUP)));

    public static final Item ENPOWRED_OBXIDIAN_BOOTS = registerItem("enpowered_obxidian_boots",
            new ArmorItem(ModArmorMaterial.ENPOWERED_OBXIDIAN, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.ORESPLUSARMORGROUP)));


    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + OresPlus.MOD_ID);
    }
}
