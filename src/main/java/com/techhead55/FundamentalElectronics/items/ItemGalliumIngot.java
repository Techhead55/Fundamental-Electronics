package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class ItemGalliumIngot extends Item {
    public ItemGalliumIngot(){
        super();
        setUnlocalizedName(Reference.componets.gallium.ingot.unlocalisedName);
        setTextureName(Reference.MOD_ID+":"+ Reference.componets.gallium.ingot.unlocalisedName);
        setCreativeTab(CreativeTabs.tabMaterials);
        setMaxStackSize(64);
    }
}
