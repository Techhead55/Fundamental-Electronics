package com.techhead55.FundamentalElectronics.items;
        import com.techhead55.FundamentalElectronics.reference.Reference;
        import net.minecraft.item.Item;
        import net.minecraft.creativetab.CreativeTabs;
public class ItemResistor extends Item {
    public ItemResistor(){
        super();
        setUnlocalizedName(Reference.Items.resistor.unlocalisedName);
        setTextureName(Reference.MOD_ID+":"+Reference.Items.resistor.unlocalisedName);
        setCreativeTab(CreativeTabs.tabMaterials);
        setMaxStackSize(64);
    }
}
