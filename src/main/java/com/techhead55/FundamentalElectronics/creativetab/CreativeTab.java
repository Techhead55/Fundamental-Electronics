package com.techhead55.FundamentalElectronics.creativetab;
import com.techhead55.FundamentalElectronics.items.Items;
import com.techhead55.FundamentalElectronics.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
public class CreativeTab {
    public static final CreativeTabs FE_TAB = new CreativeTabs(Reference.MOD_ID){
        @Override
        public Item getTabIconItem(){
            return Items.list[0];
        }
        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel(){
            return StatCollector.translateToLocal("key.categories.FE");
        }
    };
}
