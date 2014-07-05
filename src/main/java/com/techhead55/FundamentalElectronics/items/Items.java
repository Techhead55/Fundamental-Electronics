package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.utility.Logger;
import com.techhead55.FundamentalElectronics.utility.Register;
import net.minecraft.item.Item;
public class Items {
    public static Item[] list = {
            new ItemResistor(),
            new ItemCapacitor(),
            new ItemDiode(),
            new ItemTransistor(),
            new ItemGalliumIngot(),
            new ItemZincIngot()
    };
    public static void load(){
        Register.registerItems(list);
        Logger.info("All items initialised");
    }
}
