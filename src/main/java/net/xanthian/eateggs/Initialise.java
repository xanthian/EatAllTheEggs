package net.xanthian.eateggs;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.xanthian.eateggs.entity.ModEntities;
import net.xanthian.eateggs.items.ModItems;

import static net.xanthian.eateggs.items.ModItems.ITEMS;

@Mod(Initialise.MOD_ID)
public class Initialise {

    public static final String MOD_ID = "eateggs";


    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(modEventBus);
        ModEntities.ENTITY_TYPES.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        NeoForge.EVENT_BUS.register(this);
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
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.EGGS_ROTTEN.get(), ThrownItemRenderer::new);
        }
    }
}