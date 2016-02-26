package unrealmaed.petrock.blocks;

import unrealmaed.petrock.entity.EntityPetRockFollowing;
import unrealmaed.petrock.libs.Reference;
import unrealmaed.petrock.PetRock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockPetRock extends Block {

    private static String name = "BlockPetRock";

    public BlockPetRock() {
        super(Material.rock);
        setCreativeTab(PetRock.tabsPetRock);
        setHardness(0F);
        this.setUnlocalizedName(Reference.RE_PREFIX + getRegistryName());
    }

    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metaData) {

        if(!world.isRemote) {
            EntityPetRockFollowing entityPetRockFollowing = new EntityPetRockFollowing(world);
            entityPetRockFollowing.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
            world.spawnEntityInWorld(entityPetRockFollowing);
            entityPetRockFollowing.spawnExplosionParticle();
        }
        //super.onBlockDestroyedByPlayer(world, x, y, z, metaData);
    }
    public static String getName()
    {
        return name;
    }
}
