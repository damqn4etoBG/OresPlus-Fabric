package net.damqn4etobg.oresplus.block;

import net.damqn4etobg.oresplus.OresPlus;
import net.damqn4etobg.oresplus.block.custom.CornCropBlock;
import net.damqn4etobg.oresplus.block.custom.ModSaplingBlock;
import net.damqn4etobg.oresplus.block.custom.TomatoCropBlock;
import net.damqn4etobg.oresplus.item.ModItemGroup;
import net.damqn4etobg.oresplus.world.features.tree.RedwoodSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block ENPOWERED_CRYSTAL_ORE = registerBlock("enpowered_crystal_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 3).requiresTool()));

    public static final Block ALUMINIUM_ORE = registerBlock("aluminium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block URANIUM_ORE = registerBlock("uranium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(8.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 3).requiresTool()));

    public static final Block COPPER_ORE = registerBlock("copper_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 2).requiresTool()));

    public static final Block PURPLE_FUNGUS = registerBlock("purple_fungus",
            new Block(FabricBlockSettings.copy(Blocks.DIRT).sounds(BlockSoundGroup.HONEY)));

    public static final Block URANIUM_BLOCK = registerBlock("uranium_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(10.0f)
                    .breakByTool(FabricToolTags.PICKAXES, 3).requiresTool()));


    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));

    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));

    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));

    public static final Block REDWOOD_SAPLING = registerBlock("redwood_sapling",
            new ModSaplingBlock(new RedwoodSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)));

    public static final Block CORN_CROP = registerBlock("corn_crop",
            new CornCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    public static final Block TOMATO_CROP = registerBlock("tomato_crop",
            new TomatoCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(OresPlus.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(OresPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.ORESPLUSGROUP)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + OresPlus.MOD_ID);
    }
}
