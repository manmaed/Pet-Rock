package unrealmaed.petrock.libs;

import unrealmaed.petrock.libs.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures {


    // Base file paths
    public static final String MODEL_SHEET_LOCATION = "textures/entity/";

    // Item/Block sprite sheets

    // Model textures
    public static final ResourceLocation MODEL_PET_ROCK_FOLLOWING = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "PetRockFollow.png");
    public static final ResourceLocation MODEL_PET_ROCK_STAY = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "PetRockStay.png");
}
