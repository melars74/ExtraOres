package com.matt.extraores.block;

import com.matt.extraores.ExtraOres;
import com.matt.extraores.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.NeoForgeRegistriesSetup;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ExtraOres.MODID);

    public static final DeferredBlock<Block> SILVER_ORE = registerblock("bismuth_ore",
            () -> new SilverOreBlock());


    private static <T extends Block> DeferredBlock<T> registerblock(String name, Supplier<T> blockSupplier) {
        DeferredBlock<T> block = BLOCKS.register(name, blockSupplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
