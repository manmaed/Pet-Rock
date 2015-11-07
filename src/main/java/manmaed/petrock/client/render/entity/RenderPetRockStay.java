package manmaed.petrock.client.render.entity;

import manmaed.petrock.client.render.model.ModelPetRockStay;
import manmaed.petrock.entity.EntityPetRockStay;
import manmaed.petrock.libs.Textures;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by manmaed on 06/11/2015.
 */
public class RenderPetRockStay extends RenderLiving {


    public RenderPetRockStay(ModelPetRockStay modelPetRockStay, float par2) {
        super(modelPetRockStay, par2);
    }

    protected ResourceLocation getpetrockstayTexture(EntityPetRockStay par1Entity)
    {
        return Textures.MODEL_PET_ROCK_STAY;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity) {

        return this.getpetrockstayTexture((EntityPetRockStay) par1Entity);
    }


}
