package net.xanthian.eateggs.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import net.xanthian.eateggs.EatAllTheEggs;

public class Group {
    public static final ItemGroup EGGS = FabricItemGroupBuilder.build(new Identifier(EatAllTheEggs.MOD_ID, "eateggs"),
            () -> new ItemStack(Eggs.EGGS_SCRAMBLED));
}
