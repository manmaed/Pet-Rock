package unrealmaed.petrock.proxy;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import unrealmaed.petrock.client.render.entity.RenderPetRockFollowing;
import unrealmaed.petrock.client.render.entity.RenderPetRockStay;
import unrealmaed.petrock.client.render.model.ModelPetRockFollowing;
import unrealmaed.petrock.client.render.model.ModelPetRockStay;
import unrealmaed.petrock.entity.EntityPetRockFollowing;
import unrealmaed.petrock.entity.EntityPetRockStay;

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
