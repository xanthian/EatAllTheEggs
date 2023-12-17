package net.xanthian.eateggs.entity;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static net.xanthian.eateggs.Initialise.MOD_ID;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, MOD_ID);

    public static final Supplier<EntityType<RottenEggEntity>> EGGS_ROTTEN =
            ENTITY_TYPES.register("eggs_rotten",
                    () -> EntityType.Builder.<RottenEggEntity>of(RottenEggEntity::new, MobCategory.MISC)
                            .sized(0.25f, 0.25f)
                            .clientTrackingRange(4)
                            .updateInterval(10)
                            .build("eggs_rotten"));

}