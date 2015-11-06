package manmaed.petrock.libs.util;

import manmaed.petrock.libs.Reference;
import net.minecraft.util.ResourceLocation;

/**
 * Created by manmaed on 06/11/2015.
 */
public class ResourceLocationHelper {

    public static ResourceLocation getResourceLocation(String modId, String path) {

        return new ResourceLocation(modId, path);
    }

    public static ResourceLocation getResourceLocation(String path) {

        return getResourceLocation(Reference.MOD_ID.toLowerCase(), path);
    }

}
