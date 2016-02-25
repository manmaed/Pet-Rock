package com.unrealdinnerbone.petrock.blocks;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class PRBlocks {

    public static final BlockPetRock BLOCK_PET_ROCK = new BlockPetRock();

    public static void load()
    {
        GameRegistry.registerBlock(BLOCK_PET_ROCK, BlockPetRock.getName());
    }
}
