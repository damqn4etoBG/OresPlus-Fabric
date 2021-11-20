package net.damqn4etobg.oresplus.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class LightningThornsEnchantment extends Enchantment {
    public LightningThornsEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);
    }

    @Override
    public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
        if(!user.world.isClient()) {
            ServerWorld world = ((ServerWorld) user.world);
            PlayerEntity player = ((PlayerEntity) user);
            BlockPos position = attacker.getBlockPos();

            if (level == 1) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
            }

            if (level == 2) {
                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);

                EntityType.LIGHTNING_BOLT.spawn(world, null, null, player, position,
                        SpawnReason.TRIGGERED, true, true);
            }
        }

        super.onUserDamaged(user, attacker, level);
    }

    @Override
    public int getMaxLevel() {
        return 2;
    }
}
