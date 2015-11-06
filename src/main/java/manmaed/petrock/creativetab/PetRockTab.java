package manmaed.petrock.creativetab;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import manmaed.petrock.libs.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by manmaed on 05/11/2015.
 */
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
