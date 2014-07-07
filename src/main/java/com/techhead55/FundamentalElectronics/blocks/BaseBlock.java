package com.techhead55.FundamentalElectronics.blocks;
import com.techhead55.FundamentalElectronics.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
public class BaseBlock extends Block{
    public BaseBlock() {
        super(Material.iron);
        setCreativeTab(CreativeTabs.tabMaterials);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        blockIcon = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(6));
    }
}

