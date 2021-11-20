package net.damqn4etobg.oresplus.world.features;

import net.damqn4etobg.oresplus.OresPlus;
import net.damqn4etobg.oresplus.block.ModBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.HeightmapDecoratorConfig;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.heightprovider.UniformHeightProvider;
import net.minecraft.world.gen.stateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ENPOWERED_CRYSTAL_ORE_KEY = registerKey("enpowered_crystal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> COPPER_ORE_KEY = registerKey("copper_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ALUMINIUM_ORE_KEY = registerKey("aluminium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registerKey("uranium_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_TREE_KEY = registerKey("redwood_spawn");

    public static final ConfiguredFeature<TreeFeatureConfig, ?> REDWOOD_TREE = register("redwood",
            Feature.TREE.configure(new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.REDWOOD_LOG.getDefaultState()),
                    new StraightTrunkPlacer(8, 4, 3),
                    new SimpleBlockStateProvider(ModBlocks.REDWOOD_LEAVES.getDefaultState()),
                    new SimpleBlockStateProvider(ModBlocks.REDWOOD_SAPLING.getDefaultState()),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build()));

    public static final ConfiguredFeature<?, ?> REDWOOD_TREE_SPAWN = register(REDWOOD_TREE
            .decorate(Decorator.HEIGHTMAP.configure(new HeightmapDecoratorConfig(Heightmap.Type.MOTION_BLOCKING))
                    .spreadHorizontally().applyChance(3)), REDWOOD_TREE_KEY);

    public static final ConfiguredFeature<?, ?> RUBY_ORE = register(Feature.ORE.configure(
                    new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.RUBY_ORE.getDefaultState(), 6))
            .range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(2), YOffset.fixed(12))))
            .spreadHorizontally().repeat(4), RUBY_ORE_KEY);

    public static final ConfiguredFeature<?, ?> ENPOWERED_CRYSTAL_ORE = register(Feature.ORE.configure(
                    new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.ENPOWERED_CRYSTAL_ORE.getDefaultState(), 2))
            .range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(2), YOffset.fixed(12))))
            .spreadHorizontally().repeat(1), ENPOWERED_CRYSTAL_ORE_KEY);

    public static final ConfiguredFeature<?, ?> COPPER_ORE = register(Feature.ORE.configure(
                    new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.COPPER_ORE.getDefaultState(), 8))
            .range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(2), YOffset.fixed(60))))
            .spreadHorizontally().repeat(4), COPPER_ORE_KEY);

    public static final ConfiguredFeature<?, ?> ALUMINIUM_ORE = register(Feature.ORE.configure(
                    new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.ALUMINIUM_ORE.getDefaultState(), 6))
            .range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(2), YOffset.fixed(48))))
            .spreadHorizontally().repeat(3), ALUMINIUM_ORE_KEY);

    public static final ConfiguredFeature<?, ?> URANIUM_ORE = register(Feature.ORE.configure(
                    new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, ModBlocks.URANIUM_ORE.getDefaultState(), 1))
            .range(new RangeDecoratorConfig(UniformHeightProvider.create(YOffset.aboveBottom(2), YOffset.fixed(12))))
            .spreadHorizontally().repeat(1), URANIUM_ORE_KEY);



    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(Registry.CONFIGURED_FEATURE_KEY, new Identifier(OresPlus.MOD_ID, name));
    }

    private static ConfiguredFeature<TreeFeatureConfig, ?> register(String name,
                                                                    ConfiguredFeature<TreeFeatureConfig, ?> configuredFeature) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(OresPlus.MOD_ID, name),
                configuredFeature);
    }

    private static ConfiguredFeature<?, ?> register(ConfiguredFeature<?, ?> configuredFeature,
                                                    RegistryKey<ConfiguredFeature<?, ?>> key) {
        return Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), configuredFeature);
    }

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + OresPlus.MOD_ID);
    }
}
