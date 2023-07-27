package net.xanthian.eateggs.entity;

import com.google.common.base.MoreObjects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityStatuses;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;

import net.xanthian.eateggs.items.Eggs;

public class RottenEggEntity extends ThrownItemEntity {

    public RottenEggEntity(EntityType<? extends RottenEggEntity> entityType, World world) {
        super(entityType, world);
    }

    public RottenEggEntity(World world, LivingEntity owner) {
        super(ModEntities.ROTTEN_EGG_ENTITY, owner, world);
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        Entity entity2 = this.getOwner();
        LivingEntity livingEntity = entity2 instanceof LivingEntity ? (LivingEntity)entity2 : null;
        boolean bl = entity.damage(this.getDamageSources().mobProjectile(this, livingEntity), 1.0f);
        if (bl) {
            this.applyDamageEffects(livingEntity, entity);
            if (entity instanceof LivingEntity livingEntity2) {
                livingEntity2.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 200), MoreObjects.firstNonNull(entity2, this));
            }
        }
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
            this.discard();
        }
    }

    @Override
    public void handleStatus(byte status) {
        if (status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES) {
            double d = 0.08;
            for (int i = 0; i < 8; ++i) {
                this.getWorld().addParticle(new ItemStackParticleEffect(ParticleTypes.ITEM, this.getStack()), this.getX(), this.getY(), this.getZ(), ((double)this.random.nextFloat() - 0.5) * 0.08, ((double)this.random.nextFloat() - 0.5) * 0.08, ((double)this.random.nextFloat() - 0.5) * 0.08);
            }
        }
    }

    @Override
    protected Item getDefaultItem() {
        return Eggs.EGGS_ROTTEN;
    }
}