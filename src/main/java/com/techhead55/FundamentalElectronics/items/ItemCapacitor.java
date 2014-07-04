package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class ItemCapacitor extends Item {
    public ItemCapacitor(){
        super();
        setUnlocalizedName(Reference.Items.capacitor.unlocalisedName);
        setTextureName(Reference.MOD_ID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(CreativeTabs.tabMaterials);
        setMaxStackSize(64);
    }
}
