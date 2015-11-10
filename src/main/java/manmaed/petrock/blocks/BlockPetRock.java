package manmaed.petrock.blocks;

import manmaed.petrock.PetRock;
import manmaed.petrock.entity.EntityPetRockFollowing;
import manmaed.petrock.libs.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

/**
 * Created by manmaed on 10/11/2015.
 */
public class BlockPetRock extends Block {
    protected BlockPetRock() {
        super(Material.rock);
        setCreativeTab(PetRock.tabsPetRock);
        setHardness(0F);
        setBlockName("BlockPetRock");
        setBlockTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
    }

    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int metaData) {

        if(!world.isRemote) {
            EntityPetRockFollowing entityPetRockFollowing = new EntityPetRockFollowing(world);
            entityPetRockFollowing.setLocationAndAngles((double)x + 0.5D, (double)y, (double)z + 0.5D, 0.0F, 0.0F);
            world.spawnEntityInWorld(entityPetRockFollowing);
            entityPetRockFollowing.spawnExplosionParticle();
        }
        super.onBlockDestroyedByPlayer(world, x, y, z, metaData);
    }
}
