package com.unrealdinnerbone.petrock;

import com.unrealdinnerbone.petrock.blocks.PRBlocks;
import com.unrealdinnerbone.petrock.client.render.render.RenderBlocks;
import com.unrealdinnerbone.petrock.creativetab.PetRockTab;
import com.unrealdinnerbone.petrock.entity.PREntitys;
import com.unrealdinnerbone.petrock.libs.Reference;
import com.unrealdinnerbone.petrock.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


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
        PREntitys.load();
        //PRItems.load();
        //PRRecipes.load();

    }

    //init
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        //Do Stuff
        proxy.init();
        proxy.renderInformation();
        if(event.getSide().isClient()) {
            RenderBlocks.RenderBlocks();
        }
    }

    //Post Init
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        //Do Stuff
    }
}
