package com.coffeebeaver.eviria.handler;


import com.coffeebeaver.eviria.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile){

        //create the config object from the given config file
        if (configuration == null){
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            //Resync configs
            loadConfiguration();
        }
    }


    private static void loadConfiguration(){

        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Example config value");

        if (configuration.hasChanged()){
            configuration.save();
        }

    }

}
