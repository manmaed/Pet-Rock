package unrealmaed.petrock.libs.util;

import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;

public class EntityHelper {

    public static void registerEntity(Class<? extends Entity> entityClass, String entityName, int bkEggColor, int fgEggColor) {
        int id = EntityRegistry.findGlobalUniqueEntityId();

        EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
        EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, bkEggColor, fgEggColor));

    }

}
