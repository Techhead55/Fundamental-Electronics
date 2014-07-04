package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.utility.Register;
import net.minecraft.item.Item;
public class Items {
    public static Item[] list = {
            new ItemResistor(),
            new ItemCapacitor()
    };
    public static void load(){
        Register.registerItems(list);
    }
}
