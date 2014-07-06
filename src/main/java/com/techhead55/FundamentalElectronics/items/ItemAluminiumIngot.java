package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;
public class ItemAluminiumIngot extends ItemIngotBase {
    public ItemAluminiumIngot(){
        super();
        setUnlocalizedName(Reference.componets.elements.aluminium.ingot.unlocalisedName);
        setTextureName(Reference.MOD_ID+":"+ Reference.componets.elements.aluminium.ingot.unlocalisedName);
    }
}
