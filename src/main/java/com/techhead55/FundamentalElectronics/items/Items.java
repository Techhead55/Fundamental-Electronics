package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.utility.Logger;
import com.techhead55.FundamentalElectronics.utility.Register;
public class Items {
    public static net.minecraft.item.Item[] list = {
        new ItemGalliumIngot(),
        new ItemZincIngot(),
        new ItemArsenicIngot(),
        new ItemAluminiumIngot(),
        new ItemSiliconIngot(),
        new ItemGalliumArsenideBoule(),
        new ItemAluminiumSulfatePowder(),
        new ItemAluminiumHydroxidePowder(),
        new ItemAluminiumOxideWafer(),
        new ItemSodiumHydrogenCarbonatePowder(),
        new ItemSodiumChloridePowder(),
        new ItemSodiumChlorideCrystal()
    };
    public static void load(){
        Logger.info("Beginning item initialisation.");
        Register.registerItems(list);
        Logger.info("All items initialised");
    }
}
