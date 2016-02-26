package unrealmaed.petrock.client.render.render;

import unrealmaed.petrock.blocks.BlockPetRock;
import unrealmaed.petrock.blocks.PRBlocks;
import unrealmaed.petrock.libs.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RenderBlocks
{
    public static void RenderBlocks()
    {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(PRBlocks.BLOCK_PET_ROCK), 0, new ModelResourceLocation(Reference.RE_PREFIX + BlockPetRock.getName()));;
    }
}
