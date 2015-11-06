package manmaed.petrock.client.render.entity;

import manmaed.petrock.client.render.model.ModelPetRockFollowing;
import manmaed.petrock.entity.EntityPetRockFollowing;
import manmaed.petrock.libs.Textures;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
/**
 * Created by manmaed on 06/11/2015.
 */
public class RenderPetRockFollowing extends RenderLiving {


    public RenderPetRockFollowing(ModelPetRockFollowing modelPetRockFollowing, float par2) {
        super(modelPetRockFollowing, par2);
    }

    protected ResourceLocation getpetrockfollowingTexture(EntityPetRockFollowing par1Entity)
    {
        return Textures.MODEL_PET_ROCK_FOLLOWING;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity) {

        return this.getpetrockfollowingTexture((EntityPetRockFollowing) par1Entity);
    }


}
