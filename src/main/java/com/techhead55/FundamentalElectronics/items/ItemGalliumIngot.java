package com.techhead55.FundamentalElectronics.items;
import com.techhead55.FundamentalElectronics.reference.Reference;
public class ItemGalliumIngot extends ItemIngotBase {
    public ItemGalliumIngot(){
        super();
        setUnlocalizedName(Reference.componets.elements.gallium.ingot.unlocalisedName);
        setTextureName(Reference.MOD_ID + ":" + Reference.componets.elements.gallium.ingot.unlocalisedName);
    }
}
