package com.unrealdinnerbone.petrock.proxy;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import com.unrealdinnerbone.petrock.client.render.entity.RenderPetRockFollowing;
import com.unrealdinnerbone.petrock.client.render.entity.RenderPetRockStay;
import com.unrealdinnerbone.petrock.client.render.model.ModelPetRockFollowing;
import com.unrealdinnerbone.petrock.client.render.model.ModelPetRockStay;
import com.unrealdinnerbone.petrock.entity.EntityPetRockFollowing;
import com.unrealdinnerbone.petrock.entity.EntityPetRockStay;

/**
 * Created by manmaed on 05/11/2015.
 */
public class ClientProxy extends CommonProxy {

    public void preInit() {

    }
    public void init() {

    }

    public void renderInformation() {

        RenderingRegistry.registerEntityRenderingHandler(EntityPetRockFollowing.class, new RenderPetRockFollowing(new ModelPetRockFollowing(0), 0.5f));
        RenderingRegistry.registerEntityRenderingHandler(EntityPetRockStay.class, new RenderPetRockStay(new ModelPetRockStay(0), 0.5f));

    }
}
