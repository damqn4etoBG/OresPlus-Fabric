package net.damqn4etobg.oresplus.item;

import net.damqn4etobg.oresplus.OresPlus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.ORESPLUSGROUP)));

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for" + OresPlus.MOD_ID);
    }
}
