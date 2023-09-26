package net.xanthian.eateggs.items;

import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.eateggs.Initialise;
import net.xanthian.eateggs.items.custom.ModFoods;
import net.xanthian.eateggs.items.custom.RottenEggItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    public static final RegistryObject<Item> EGGS_BACON = ITEMS.register("eggs_and_bacon",
            () -> new BowlFoodItem(new Item.Properties().food(ModFoods.EGGS_BACON).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final RegistryObject<Item> EGGS_BEEF = ITEMS.register("eggs_and_beef",
            () -> new BowlFoodItem(new Item.Properties().food(ModFoods.EGGS_BEEF).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final RegistryObject<Item> EGGS_BOILED = ITEMS.register("eggs_boiled",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_BOILED)));

    public static final RegistryObject<Item> EGGS_FRIED = ITEMS.register("eggs_fried",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_FRIED)));

    public static final RegistryObject<Item> EGGS_FRIED_ON_TOAST = ITEMS.register("eggs_fried_on_toast",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_FRIED_ON_TOAST)));

    public static final RegistryObject<Item> EGGS_MUSHROOM_OMELETTE = ITEMS.register("eggs_mushroom_omelette",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_MUSHROOM_OMELETTE)));

    public static final RegistryObject<Item> EGGS_ROTTEN = ITEMS.register("eggs_rotten",
            () -> new RottenEggItem((new Item.Properties()).stacksTo(16)));

    public static final RegistryObject<Item> EGGS_SALAD = ITEMS.register("eggs_salad",
            () -> new BowlFoodItem(new Item.Properties().food(ModFoods.EGGS_SALAD).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final RegistryObject<Item> EGGS_SCRAMBLED = ITEMS.register("eggs_scrambled",
            () -> new BowlFoodItem(new Item.Properties().food(ModFoods.EGGS_SCRAMBLED).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final RegistryObject<Item> EGGS_SCRAMBLED_SANDWICH = ITEMS.register("eggs_scrambled_sandwich",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_SCRAMBLED_SANDWICH)));

    public static final RegistryObject<Item> EGGS_SLICED_BREAD = ITEMS.register("eggs_sliced_bread",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_SLICED_BREAD)));

    public static final RegistryObject<Item> EGGS_SMOKY_BACON = ITEMS.register("eggs_smoky_bacon",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_SMOKY_BACON)));

    public static final RegistryObject<Item> EGGS_STEW = ITEMS.register("eggs_stew",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_STEW).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final RegistryObject<Item> EGGS_TOAST = ITEMS.register("eggs_toast",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_TOAST)));

    public static final RegistryObject<Item> GOLDEN_EGG = ITEMS.register("golden_egg",
            () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_EGG).stacksTo(16)));

}