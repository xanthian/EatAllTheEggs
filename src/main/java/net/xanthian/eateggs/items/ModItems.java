package net.xanthian.eateggs.items;

import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.xanthian.eateggs.items.custom.ModFoods;
import net.xanthian.eateggs.items.custom.RottenEggItem;

import static net.xanthian.eateggs.Initialise.MOD_ID;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredItem<Item> EGGS_BACON = ITEMS.register("eggs_and_bacon",
            () -> new BowlFoodItem(new Item.Properties().food(ModFoods.EGGS_BACON).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final DeferredItem<Item> EGGS_BEEF = ITEMS.register("eggs_and_beef",
            () -> new BowlFoodItem(new Item.Properties().food(ModFoods.EGGS_BEEF).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final DeferredItem<Item> EGGS_BOILED = ITEMS.register("eggs_boiled",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_BOILED)));

    public static final DeferredItem<Item> EGGS_FRIED = ITEMS.register("eggs_fried",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_FRIED)));

    public static final DeferredItem<Item> EGGS_FRIED_ON_TOAST = ITEMS.register("eggs_fried_on_toast",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_FRIED_ON_TOAST)));

    public static final DeferredItem<Item> EGGS_MUSHROOM_OMELETTE = ITEMS.register("eggs_mushroom_omelette",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_MUSHROOM_OMELETTE)));

    public static final DeferredItem<Item> EGGS_ROTTEN = ITEMS.register("eggs_rotten",
            () -> new RottenEggItem((new Item.Properties()).stacksTo(16)));

    public static final DeferredItem<Item> EGGS_SALAD = ITEMS.register("eggs_salad",
            () -> new BowlFoodItem(new Item.Properties().food(ModFoods.EGGS_SALAD).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final DeferredItem<Item> EGGS_SCRAMBLED = ITEMS.register("eggs_scrambled",
            () -> new BowlFoodItem(new Item.Properties().food(ModFoods.EGGS_SCRAMBLED).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final DeferredItem<Item> EGGS_SCRAMBLED_SANDWICH = ITEMS.register("eggs_scrambled_sandwich",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_SCRAMBLED_SANDWICH)));

    public static final DeferredItem<Item> EGGS_SLICED_BREAD = ITEMS.register("eggs_sliced_bread",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_SLICED_BREAD)));

    public static final DeferredItem<Item> EGGS_SMOKY_BACON = ITEMS.register("eggs_smoky_bacon",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_SMOKY_BACON)));

    public static final DeferredItem<Item> EGGS_STEW = ITEMS.register("eggs_stew",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_STEW).stacksTo(1).craftRemainder(Items.BOWL)));

    public static final DeferredItem<Item> EGGS_TOAST = ITEMS.register("eggs_toast",
            () -> new Item(new Item.Properties().food(ModFoods.EGGS_TOAST)));

    public static final DeferredItem<Item> GOLDEN_EGG = ITEMS.register("golden_egg",
            () -> new Item(new Item.Properties().food(ModFoods.GOLDEN_EGG).stacksTo(16)));

}