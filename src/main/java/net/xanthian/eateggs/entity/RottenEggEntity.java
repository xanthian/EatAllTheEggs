package net.xanthian.eateggs.entity;

import com.google.common.base.MoreObjects;

import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityEvent;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import net.xanthian.eateggs.items.ModItems;
import org.jetbrains.annotations.NotNull;

public class RottenEggEntity extends ThrowableItemProjectile {

    public RottenEggEntity(EntityType<? extends RottenEggEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public RottenEggEntity(Level pLevel, LivingEntity pShooter) {
        super(ModEntities.EGGS_ROTTEN.get(), pShooter, pLevel);
    }

    public RottenEggEntity(Level pLevel, double pX, double pY, double pZ) {
        super(ModEntities.EGGS_ROTTEN.get(), pX, pY, pZ, pLevel);
    }


    @Override
    protected void onHitEntity(@NotNull EntityHitResult pResult) {
        super.onHitEntity(pResult);
        Entity entity = pResult.getEntity();
        Entity entity2 = this.getOwner();
        LivingEntity livingEntity = entity2 instanceof LivingEntity ? (LivingEntity)entity2 : null;
        boolean bl = entity.hurt(this.damageSources().mobProjectile(this, livingEntity), 1.0f);
        if (bl) {
            this.doEnchantDamageEffects(livingEntity, entity);
            if (entity instanceof LivingEntity livingEntity2) {
                livingEntity2.addEffect(new MobEffectInstance(MobEffects.POISON, 200), MoreObjects.firstNonNull(entity2, this));
            }
        }
    }

    @Override
    protected void onHit(@NotNull HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            this.level().broadcastEntityEvent(this, EntityEvent.DEATH);
            this.discard();
        }
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void handleEntityEvent(byte status) {
        if (status == 3) {
            double d = 0.08;
            for (int i = 0; i < 8; ++i) {
                this.level().addParticle(new ItemParticleOption(ParticleTypes.ITEM, this.getItem()), this.getX(), this.getY(), this.getZ(), ((double)this.random.nextFloat() - 0.5) * 0.08, ((double)this.random.nextFloat() - 0.5) * 0.08, ((double)this.random.nextFloat() - 0.5) * 0.08);
            }
        }
    }

    @Override
    protected @NotNull Item getDefaultItem() {
        return ModItems.EGGS_ROTTEN.get();
    }

    @Override
    public @NotNull Packet<ClientGamePacketListener> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}