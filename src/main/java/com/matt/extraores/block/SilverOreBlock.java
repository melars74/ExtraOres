package com.matt.extraores.block;

import net.minecraft.client.resources.model.Material;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class SilverOreBlock extends DropExperienceBlock {
    public SilverOreBlock() {
        super(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                .strength(3.0f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE));
    }
}
