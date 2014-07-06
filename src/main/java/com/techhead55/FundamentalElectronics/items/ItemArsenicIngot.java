package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;
public class ItemArsenicIngot extends ItemIngotBase {
    public ItemArsenicIngot(){
        super();
        setUnlocalizedName(Reference.componets.elements.arsenic.ingot.unlocalisedName);
        setTextureName(Reference.MOD_ID+":"+ Reference.componets.elements.arsenic.ingot.unlocalisedName);
    }
}
