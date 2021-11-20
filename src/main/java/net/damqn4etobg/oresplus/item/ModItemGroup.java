package net.damqn4etobg.oresplus.item;

import net.damqn4etobg.oresplus.OresPlus;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ORESPLUSGROUP = FabricItemGroupBuilder.build(new Identifier(OresPlus.MOD_ID, "oresplusgroup"),
            () -> new ItemStack(ModItems.RUBY));

    public static final ItemGroup ORESPLUSTOOLSGROUP = FabricItemGroupBuilder.build(new Identifier(OresPlus.MOD_ID, "oresplustoolsgroup"),
            () -> new ItemStack(ModItems.RUBY_SWORD));

    public static final ItemGroup ORESPLUSARMORGROUP = FabricItemGroupBuilder.build(new Identifier(OresPlus.MOD_ID, "oresplusarmorgroup"),
            () -> new ItemStack(ModItems.RUBY_CHESTPLATE));

    public static final ItemGroup ORESPLUSFARMGROUP = FabricItemGroupBuilder.build(new Identifier(OresPlus.MOD_ID, "oresplusfarmgroup"),
            () -> new ItemStack(ModItems.CORN));

    public static final ItemGroup ORESPLUSENGINEERINGGROUP = FabricItemGroupBuilder.build(new Identifier(OresPlus.MOD_ID, "oresplusengineeringgroup"),
            () -> new ItemStack(ModItems.IRON_PLATE));

}
