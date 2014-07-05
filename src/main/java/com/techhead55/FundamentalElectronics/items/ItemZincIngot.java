package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class ItemZincIngot extends Item {
    public ItemZincIngot(){
        super();
        setUnlocalizedName(Reference.componets.zinc.ingot.unlocalisedName);
        setTextureName(Reference.MOD_ID+":"+ Reference.componets.zinc.ingot.unlocalisedName);
        setCreativeTab(CreativeTabs.tabMaterials);
        setMaxStackSize(64);
    }
}
