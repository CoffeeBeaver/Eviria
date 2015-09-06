package com.coffeebeaver.eviria;

import com.coffeebeaver.eviria.handler.ConfigurationHandler;
import com.coffeebeaver.eviria.proxy.IProxy;
import com.coffeebeaver.eviria.reference.Reference;
import com.coffeebeaver.eviria.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class Eviria {

    @Mod.Instance(Reference.MOD_ID)
    public static Eviria instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;


    @Mod.EventHandler //Network handling, mod configs, items, blocks
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization complete!");
    }


    @Mod.EventHandler //gui, tile entities, recipes, general event handlers
    public void init(FMLInitializationEvent event){
        LogHelper.info("Initialization complete!");

    }

    @Mod.EventHandler //stuff to do after other mods have done stuff
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization complete!");


    }
}
