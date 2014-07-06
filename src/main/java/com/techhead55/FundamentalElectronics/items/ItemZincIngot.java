package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;
public class ItemZincIngot extends ItemIngotBase {
    public ItemZincIngot(){
        super();
        setUnlocalizedName(Reference.componets.elements.zinc.ingot.unlocalisedName);
        setTextureName(Reference.MOD_ID+":"+ Reference.componets.elements.zinc.ingot.unlocalisedName);
    }
}
