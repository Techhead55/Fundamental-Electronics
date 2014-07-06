package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.utility.Logger;
import com.techhead55.FundamentalElectronics.utility.Register;
import net.minecraft.item.Item;
public class Items {
    public static Item[] list = {
        new ItemGalliumIngot(),
        new ItemZincIngot(),
        new ItemArsenicIngot(),
        new ItemAluminiumIngot(),
        new ItemSiliconIngot()
    };
    public static void load(){
        Logger.info("Beginning item initialisation.");
        Register.registerItems(list);
        Logger.info("All items initialised");
    }
}
