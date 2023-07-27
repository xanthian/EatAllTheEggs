package net.xanthian.eateggs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

import net.xanthian.eateggs.entity.ModEntities;

public class ClientInitialise implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ClientInitialise.registerRenderers();
    }
        @Environment(EnvType.CLIENT)
        public static void registerRenderers() {
            EntityRendererRegistry.register(ModEntities.ROTTEN_EGG_ENTITY, FlyingItemEntityRenderer::new);
    }
}
