package manmaed.petrock.libs;

import manmaed.petrock.libs.util.ResourceLocationHelper;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;

/**
 * Created by manmaed on 06/11/2015.
 */
public class Textures {


    // Base file paths
    public static final String MODEL_SHEET_LOCATION = "textures/entity/";

    // Item/Block sprite sheets
    public static final ResourceLocation VANILLA_BLOCK_TEXTURE_SHEET = TextureMap.locationBlocksTexture;
    public static final ResourceLocation VANILLA_ITEM_TEXTURE_SHEET = TextureMap.locationItemsTexture;


    // Model textures
    public static final ResourceLocation MODEL_PET_ROCK_FOLLOWING = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "GreenPuppy.png");
}
