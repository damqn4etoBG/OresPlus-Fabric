package net.damqn4etobg.oresplus.block;

import net.damqn4etobg.oresplus.OresPlus;
import net.damqn4etobg.oresplus.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(OresPlus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.ORESPLUSGROUP)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for" + OresPlus.MOD_ID);
    }
}
