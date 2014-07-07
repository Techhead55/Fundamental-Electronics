package com.techhead55.FundamentalElectronics.blocks;
import com.techhead55.FundamentalElectronics.utility.Logger;
import com.techhead55.FundamentalElectronics.utility.Register;
import net.minecraft.block.Block;
public class Blocks {
    public static Block[] list = {
        new BlockCrushingStation()
    };
    public static void load(){
        Logger.info("Beginning block initialisation.");
        Register.registerBlocks(list);
        Logger.info("All blocks initialised");
    }
}
