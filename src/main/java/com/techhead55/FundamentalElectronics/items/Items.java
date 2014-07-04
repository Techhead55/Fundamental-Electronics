package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.utility.Register;
import net.minecraft.item.Item;
public class Items {
    public static Item resistor, capacitor;
    public static void load(){
        resistor = new ItemResistor();
        capacitor = new ItemCapacitor();
        Item[] unregistered = {resistor, capacitor};
        Register.registerItem(unregistered);
    }
}
