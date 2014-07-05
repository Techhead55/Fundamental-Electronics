package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
public class ItemDiode extends Item {
    public ItemDiode(){
        super();
        setUnlocalizedName(Reference.componets.diode.unlocalisedName);
        setTextureName(Reference.MOD_ID+":"+ Reference.componets.diode.unlocalisedName);
        setCreativeTab(CreativeTabs.tabMaterials);
        setMaxStackSize(64);
    }
}
