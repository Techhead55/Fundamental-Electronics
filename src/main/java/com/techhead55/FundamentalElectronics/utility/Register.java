package com.techhead55.FundamentalElectronics.utility;
import com.techhead55.FundamentalElectronics.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
public class Register {
    public static void registerBlock(Block block){
        GameRegistry.registerBlock(block, Reference.MOD_ID + "_" + block.getUnlocalizedName().substring(5));
        Logger.info(block.getUnlocalizedName()+" was registered");
    }
    public static void registerBlocks(Block[] blocks){
        for (Block block : blocks){
            GameRegistry.registerBlock(block, Reference.MOD_ID + "_" + block.getUnlocalizedName().substring(5));
            Logger.info(block.getUnlocalizedName()+" was registered");
        }
    }
    public static void registerItem(Item item){
        GameRegistry.registerItem(item, Reference.MOD_ID + "_" + item.getUnlocalizedName().substring(5));
        Logger.info(item.getUnlocalizedName()+" was registered.");
    }
    public static void registerItems(Item[] items){
        for (Item item : items){
            GameRegistry.registerItem(item, Reference.MOD_ID + "_" + item.getUnlocalizedName().substring(5));
            Logger.info(item.getUnlocalizedName()+" was registered.");
        }
    }
}
