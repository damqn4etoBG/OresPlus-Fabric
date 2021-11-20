package net.damqn4etobg.oresplus.enchantments;

import net.damqn4etobg.oresplus.OresPlus;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {
    public static Enchantment LIGHTNING_STRIKER = register("lightning_striker",
            new LightningStrikerEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.WEAPON, EquipmentSlot.MAINHAND));

    public static Enchantment LIGHTNING_THORNS = register("lightning_thorns",
            new LightningThornsEnchantment(Enchantment.Rarity.VERY_RARE,
                    EnchantmentTarget.ARMOR, EquipmentSlot.values()));


    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registry.ENCHANTMENT, new Identifier(OresPlus.MOD_ID, name), enchantment);
    }

    public static void registerModEnchantments() {
        System.out.println("Registering ModEnchantments for " + OresPlus.MOD_ID);
    }
}
