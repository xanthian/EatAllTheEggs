package net.xanthian.eateggs.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.eateggs.Initialise;
import net.xanthian.eateggs.entity.ModEntities;

public class Eggs {

    public static final Item EGGS_BACON = registerItem("eggs_and_bacon",
            new StewItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.85F).build())));

    public static final Item EGGS_BEEF = registerItem("eggs_and_beef",
            new StewItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.85F).build())));

    public static final Item EGGS_BOILED = registerItem("eggs_boiled",
            new Item(new FabricItemSettings().maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build())));

    public static final Item EGGS_FRIED = registerItem("eggs_fried",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7F).build())));

    public static final Item EGGS_FRIED_ON_TOAST = registerItem("eggs_fried_on_toast",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7F).build())));

    public static final Item EGGS_MUSHROOM_OMELETTE = registerItem("eggs_mushroom_omelette",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7F).build())));

    public static final Item EGGS_ROTTEN = registerItem("eggs_rotten",
            new RottenEggItem(ModEntities.ROTTEN_EGG_ENTITY));

    public static final Item EGGS_SALAD = registerItem("eggs_salad",
            new StewItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).build())));

    public static final Item EGGS_SCRAMBLED = registerItem("eggs_scrambled",
            new StewItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7F).build())));

    public static final Item EGGS_SCRAMBLED_SANDWICH = registerItem("eggs_scrambled_sandwich",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7F).build())));

    public static final Item EGGS_SLICED_BREAD = registerItem("eggs_sliced_bread",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build())));

    public static final Item EGGS_SMOKY_BACON = registerItem("eggs_smoky_bacon",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build())));

    public static final Item EGGS_STEW = registerItem("eggs_stew",
            new StewItem(new FabricItemSettings().food(new FoodComponent.Builder().hunger(8).build())));

    public static final Item EGGS_TOAST = registerItem("eggs_toast",
            new Item(new FabricItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4F).build())));

    public static final Item GOLDEN_EGG = registerItem("golden_egg",
            new Item(new FabricItemSettings().maxCount(16).food(new FoodComponent.Builder().hunger(6).saturationModifier(1.2f).build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}