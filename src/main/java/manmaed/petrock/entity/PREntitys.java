package manmaed.petrock.entity;

import manmaed.petrock.libs.util.EntityHelper;

/**
 * Created by manmaed on 06/11/2015.
 */
public class PREntitys {

    public static void load() {

        /* EntityHelper.registerEntity(EntityClassName.class, "Name",  bkEggColor, dotEggColor); */
        EntityHelper.registerEntity(EntityPetRockFollowing.class, "PetRockFollowing", 0x292929, 0xd6d6d6);
    }

}
