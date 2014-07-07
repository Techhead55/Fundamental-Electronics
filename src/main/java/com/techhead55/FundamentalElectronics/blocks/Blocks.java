package com.techhead55.FundamentalElectronics.blocks;
import com.techhead55.FundamentalElectronics.utility.Logger;
import com.techhead55.FundamentalElectronics.utility.Register;
import net.minecraft.block.Block;
public class Blocks {
    public static Block[] list = {
        new BlockCrushingStation(),
        new BlockGallium(),
        new BlockZinc(),
        new BlockArsenic(),
        new BlockAluminium(),
        new BlockSilicon()
    };
    public static void load(){
        Logger.info("Beginning block initialisation.");
        Register.registerBlocks(list);
        Logger.info("All blocks initialised");
    }
}
/*
    public static class list {
        public static Block craftingStation = new BlockCrushingStation();
        public static Block gallium = new BlockGallium();
        public static Block zinc = new BlockZinc();
        public static Block arsenic = new BlockArsenic();
        public static Block aluminium = new BlockAluminium();
        public static Block silicon = new BlockSilicon();
    }
*/