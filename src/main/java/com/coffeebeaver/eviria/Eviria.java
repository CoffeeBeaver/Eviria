package com.coffeebeaver.eviria;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "Eviria", name = "Eviria", version = "1.7.10-1.0.0")

public class Eviria {

    @Mod.Instance("Eviria")
    public static Eviria instance;

    @Mod.EventHandler //Network handling, mod configs, items, blocks
    public void preInit(FMLPreInitializationEvent event){


    }


    @Mod.EventHandler //gui, tile entities, recipes, general event handlers
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler //stuff to do after other mods have done stuff
    public void postInit(FMLPostInitializationEvent event){


    }
}
