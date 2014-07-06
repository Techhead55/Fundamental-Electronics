package com.techhead55.FundamentalElectronics.items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class ItemIngotBase extends Item{
    public ItemIngotBase(){
        super();
        setCreativeTab(CreativeTabs.tabMaterials);
        setMaxStackSize(64);
    }
}
