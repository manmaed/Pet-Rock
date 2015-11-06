package manmaed.petrock.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import manmaed.petrock.client.render.entity.RenderPetRockFollowing;
import manmaed.petrock.client.render.model.ModelPetRockFollowing;
import manmaed.petrock.entity.EntityPetRockFollowing;

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

    }
}
