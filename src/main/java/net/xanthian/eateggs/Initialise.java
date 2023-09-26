package net.xanthian.eateggs;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.item.CreativeModeTabs;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.xanthian.eateggs.entity.ModEntities;
import net.xanthian.eateggs.items.ModItems;

@Mod(Initialise.MOD_ID)
public class Initialise {

    public static final String MOD_ID = "eateggs";

    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        ModEntities.ENTITY_TYPES.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.EGGS_BACON);
            event.accept(ModItems.EGGS_BEEF);
            event.accept(ModItems.EGGS_BOILED);
            event.accept(ModItems.EGGS_FRIED);
            event.accept(ModItems.EGGS_FRIED_ON_TOAST);
            event.accept(ModItems.EGGS_MUSHROOM_OMELETTE);
            event.accept(ModItems.EGGS_ROTTEN);
            event.accept(ModItems.EGGS_SALAD);
            event.accept(ModItems.EGGS_SCRAMBLED);
            event.accept(ModItems.EGGS_SCRAMBLED_SANDWICH);
            event.accept(ModItems.EGGS_SLICED_BREAD);
            event.accept(ModItems.EGGS_SMOKY_BACON);
            event.accept(ModItems.EGGS_STEW);
            event.accept(ModItems.EGGS_TOAST);
            event.accept(ModItems.GOLDEN_EGG);

    }

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.EGGS_ROTTEN.get(), ThrownItemRenderer::new);
        }
    }
}