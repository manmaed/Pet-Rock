package manmaed.petrock.client.render.entity;

import manmaed.petrock.client.render.model.PetRockFollowing;
import manmaed.petrock.entity.EntityPetRockFollowing;
import manmaed.petrock.libs.Textures;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

/**
 * Created by manmaed on 06/11/2015.
 */
public class RenderPetRockFollowing extends EntityLiving {

    public RenderPetRockFollowing(PetRockFollowing petrockfollowing, float par2)
    {
        super(petrockfollowing, par2);

    }
    protected ResourceLocation getpetrockfollowingTexture(EntityPetRockFollowing par1Entity)
    {
        return Textures.MODEL_PET_ROCK_FOLLOWING;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity) {

        return this.getpetrockfollowingTexture((EntityPetRockFollowing) par1Entity);
    }


}
