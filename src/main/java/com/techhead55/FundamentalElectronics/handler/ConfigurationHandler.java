package com.techhead55.FundamentalElectronics.handler;
import com.techhead55.FundamentalElectronics.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;
public class ConfigurationHandler{
    public static Configuration configuration;
    public static void init(File configFile){
        if (configuration == null){
            configuration = new Configuration(configFile);
            loadConfig();
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            loadConfig();
        }
    }
    private static void loadConfig(){
        if (configuration.hasChanged()) configuration.save();
    }
}