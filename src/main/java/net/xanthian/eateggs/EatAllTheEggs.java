package net.xanthian.eateggs;

import net.fabricmc.api.ModInitializer;

import net.xanthian.eateggs.items.Eggs;


public class EatAllTheEggs implements ModInitializer {

	public static final String MOD_ID = "eateggs";

	@Override
	public void onInitialize() {

		Eggs.registerModItems();
	}
}