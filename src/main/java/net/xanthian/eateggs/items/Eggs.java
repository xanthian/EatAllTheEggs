package net.xanthian.eateggs.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;

import net.xanthian.eateggs.EatAllTheEggs;

public class Eggs {

    //Items
    public static final Item EGGS_BACON = registerItem("eggs_and_bacon",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.85F).build())));
    public static final Item EGGS_BEEF = registerItem("eggs_and_beef",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.85F).build())));
    public static final Item EGGS_BOILED_EGG = registerItem("eggs_boiled_egg",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build())));
    public static final Item EGGS_FRIED = registerItem("eggs_fried",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7F).build())));
    public static final Item EGGS_FRIED_ON_TOAST = registerItem("eggs_fried_on_toast",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7F).build())));
    public static final Item EGGS_MUSHROOM_OMELETTE = registerItem("eggs_mushroom_omelette",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7F).build())));
    public static final Item EGGS_SALAD = registerItem("eggs_salad",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).build())));
    public static final Item EGGS_SCRAMBLED = registerItem("eggs_scrambled",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(6).saturationModifier(0.7F).build())));
    public static final Item EGGS_SCRAMBLED_SANDWICH = registerItem("eggs_scrambled_sandwich",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(7).saturationModifier(0.7F).build())));
    public static final Item EGGS_SLICED_BREAD = registerItem("eggs_sliced_bread",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.2F).build())));
    public static final Item EGGS_SMOKEY_BACON = registerItem("eggs_smokey_bacon",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(8).saturationModifier(0.8F).meat().build())));
    public static final Item EGGS_TOAST = registerItem("eggs_toast",
            new Item(new FabricItemSettings().group(Group.EGGS).food(new FoodComponent.Builder().hunger(3).saturationModifier(0.4F).build())));


    //Register Items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(EatAllTheEggs.MOD_ID, name), item);
    }
    //Loaded Log
    public static void registerModItems() {
        System.out.println("Registering items for "+ EatAllTheEggs.MOD_ID);
    }
}