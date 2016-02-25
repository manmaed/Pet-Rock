package com.unrealdinnerbone.petrock.client.render.entity;

import com.unrealdinnerbone.petrock.client.render.model.ModelPetRockFollowing;
import com.unrealdinnerbone.petrock.entity.EntityPetRockFollowing;
import com.unrealdinnerbone.petrock.libs.Textures;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderPetRockFollowing extends RenderLiving {


    public RenderPetRockFollowing(ModelPetRockFollowing modelPetRockFollowing, float par2) {
        super(Minecraft.getMinecraft().getRenderManager(), modelPetRockFollowing, par2);
    }

    protected ResourceLocation getpetrockfollowingTexture(EntityPetRockFollowing par1Entity)
    {
        return Textures.MODEL_PET_ROCK_FOLLOWING;
    }

    protected ResourceLocation getEntityTexture(Entity par1Entity) {

        return this.getpetrockfollowingTexture((EntityPetRockFollowing) par1Entity);
    }


}
