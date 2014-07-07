package com.techhead55.FundamentalElectronics;
import com.techhead55.FundamentalElectronics.blocks.Blocks;
import com.techhead55.FundamentalElectronics.handler.ConfigurationHandler;
import com.techhead55.FundamentalElectronics.items.Items;
import com.techhead55.FundamentalElectronics.proxy.IProxy;
import com.techhead55.FundamentalElectronics.reference.Reference;
import com.techhead55.FundamentalElectronics.utility.Logger;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class FundamentalElectronics {
    @Instance(Reference.MOD_ID)
    public static FundamentalElectronics instance;
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        Items.load();
        Blocks.load();
        Logger.info("Pre Initialisation Complete");
    }
    /* Creative Tab
    public static CreativeTabs FundamentalElectronicsTab = new CreativeTabs(Reference.CREATIVE_TAB_UNLOCALISED_NAME){
        @Override
        public Item getTabIconItem() {
            return Items.list[0];
        }
    };*/
    @EventHandler
    public void init(FMLInitializationEvent event){
        Logger.info("Initialisation complete");
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        Logger.info("Post Initialisation Complete");
    }
}