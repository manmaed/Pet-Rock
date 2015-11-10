package manmaed.petrock;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import manmaed.petrock.blocks.PRBlocks;
import manmaed.petrock.creativetab.PetRockTab;
import manmaed.petrock.entity.PREntitys;
import manmaed.petrock.libs.Reference;
import manmaed.petrock.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by manmaed on 05/11/2015.
 */

//Forge: Hay im a mod load me!
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class PetRock {

    //Forge: This is a Mod!
    @Mod.Instance(Reference.MOD_ID)
    public static PetRock instance;

    //Proxy Stuff
    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.PROXY_COMMON)
    public static CommonProxy proxy;

    //Creative Tabs
    public static CreativeTabs tabsPetRock = new PetRockTab(CreativeTabs.getNextID());


    //Forge Events

    //Pre init
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        //Do Stuff
        proxy.preInit();
        PRBlocks.load();
        //PRItems.load();
        PREntitys.load();
        //PRRecipes.load();

    }

    //init
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        //Do Stuff
        proxy.init();
        proxy.renderInformation();
    }

    //Post Init
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //Do Stuff
    }
}
