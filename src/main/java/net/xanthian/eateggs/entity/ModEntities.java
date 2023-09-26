package net.xanthian.eateggs.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.eateggs.Initialise;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Initialise.MOD_ID);

    public static final RegistryObject<EntityType<RottenEggEntity>> EGGS_ROTTEN =
            ENTITY_TYPES.register("eggs_rotten",
            () -> EntityType.Builder.<RottenEggEntity>of(RottenEggEntity::new, MobCategory.MISC)
                    .sized(0.25f, 0.25f)
                    .clientTrackingRange(4)
                    .updateInterval(10)
                    .build("eggs_rotten"));

}