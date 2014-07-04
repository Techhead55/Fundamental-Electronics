package com.techhead55.FundamentalElectronics.utility;
import com.techhead55.FundamentalElectronics.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
public class Register {
    public static void registerBlock(Block block){
        GameRegistry.registerBlock(block, Reference.MOD_ID + "_" + block.getUnlocalizedName().substring(5));
    }
    public static void registerItem(Item[] items){
        for (Item item : items){
            GameRegistry.registerItem(item, Reference.MOD_ID + "_" + item.getUnlocalizedName().substring(5));
        }
    }
}