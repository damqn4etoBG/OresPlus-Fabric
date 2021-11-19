package net.damqn4etobg.oresplus.item;

import net.damqn4etobg.oresplus.OresPlus;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ORESPLUSGROUP = FabricItemGroupBuilder.build(new Identifier(OresPlus.MOD_ID, "oresplusgroup"),
            () -> new ItemStack(ModItems.RUBY));
}
