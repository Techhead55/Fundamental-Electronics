package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class ItemTransistor extends Item {
    public ItemTransistor (){
        super();
        setUnlocalizedName(Reference.componets.transistor.unlocalisedName);
        setTextureName(Reference.MOD_ID+":"+ Reference.componets.transistor.unlocalisedName);
        setCreativeTab(CreativeTabs.tabMaterials);
        setMaxStackSize(64);
    }
}
