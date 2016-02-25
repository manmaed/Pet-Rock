package com.unrealdinnerbone.petrock.client.render.entity;

import com.unrealdinnerbone.petrock.client.render.model.ModelPetRockStay;
import com.unrealdinnerbone.petrock.entity.EntityPetRockStay;
import com.unrealdinnerbone.petrock.libs.Textures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderPetRockStay extends RenderLiving {


    public RenderPetRockStay(ModelPetRockStay modelPetRockStay, float par2) {
        super(Minecraft.getMinecraft().getRenderManager(), modelPetRockStay, par2);
    }

    protected ResourceLocation getpetrockstayTexture(EntityPetRockStay par1Entity)
    {
        return Textures.MODEL_PET_ROCK_STAY;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity) {

        return this.getpetrockstayTexture((EntityPetRockStay) par1Entity);
    }


}
