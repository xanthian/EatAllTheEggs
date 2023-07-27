package net.xanthian.eateggs;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.eateggs.items.Eggs;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "eateggs";

	public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "eatalltheeggs"));

	@Override
	public void onInitialize() {

		Eggs.registerModItems();

		Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
				.displayName(Text.literal("Eat All The Eggs"))
				.icon(() -> new ItemStack(Eggs.EGGS_SCRAMBLED))
				.entries((context, entries) -> {
					entries.add(Eggs.EGGS_BOILED);
					entries.add(Eggs.EGGS_SALAD);
					entries.add(Eggs.EGGS_STEW);
					entries.add(Eggs.EGGS_FRIED);
					entries.add(Eggs.EGGS_FRIED_ON_TOAST);
					entries.add(Eggs.GOLDEN_EGG);
					entries.add(Eggs.EGGS_MUSHROOM_OMELETTE);
					entries.add(Eggs.EGGS_ROTTEN);
					entries.add(Eggs.EGGS_SCRAMBLED);
					entries.add(Eggs.EGGS_SCRAMBLED_SANDWICH);
					entries.add(Eggs.EGGS_BACON);
					entries.add(Eggs.EGGS_BEEF);
					entries.add(Eggs.EGGS_SLICED_BREAD);
					entries.add(Eggs.EGGS_TOAST);
					entries.add(Eggs.EGGS_SMOKY_BACON);


				})
				.build());
	}
}