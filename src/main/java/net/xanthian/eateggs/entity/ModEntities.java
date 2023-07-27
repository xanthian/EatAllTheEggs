package net.xanthian.eateggs.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;

import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.eateggs.Initialise;

public class ModEntities {

    public static final EntityType<RottenEggEntity> ROTTEN_EGG_ENTITY = registerRottenEgg("rotten_egg");

    private static EntityType<RottenEggEntity> registerRottenEgg(final String id) {
        return Registry.register(Registries.ENTITY_TYPE, new Identifier(Initialise.MOD_ID, id),
                FabricEntityTypeBuilder.<RottenEggEntity>create(SpawnGroup.MISC, RottenEggEntity::new)
                        .dimensions(EntityDimensions.fixed(0.25F, 0.25F))
                        .trackRangeBlocks(4)
                        .trackedUpdateRate(10)
                        .build());
    }
}