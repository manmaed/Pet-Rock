package com.unrealdinnerbone.petrock.creativetab;

import com.unrealdinnerbone.petrock.libs.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class PetRockTab extends CreativeTabs {
    public PetRockTab(int nextID) {
        super(Reference.MOD_ID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public Item getTabIconItem() {
        return Items.item_frame;
    }
}
