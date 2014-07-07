package com.techhead55.FundamentalElectronics.creativetab;
import com.techhead55.FundamentalElectronics.items.Items;
import com.techhead55.FundamentalElectronics.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class CreativeTab {
    public static final CreativeTabs FE_TAB = new CreativeTabs(Reference.MOD_ID){
        @Override
        public Item getTabIconItem(){
            return Items.list[0];
        }
    };
}
