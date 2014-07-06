package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;

public class ItemSiliconIngot extends ItemIngotBase {
    public ItemSiliconIngot(){
        super();
        setUnlocalizedName(Reference.componets.elements.silicon.ingot.unlocalisedName);
        setTextureName(Reference.MOD_ID+":"+ Reference.componets.elements.silicon.ingot.unlocalisedName);
    }
}
