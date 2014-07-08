package com.techhead55.FundamentalElectronics.blocks;
import com.techhead55.FundamentalElectronics.creativetab.CreativeTab;
import com.techhead55.FundamentalElectronics.reference.Reference;
import com.techhead55.FundamentalElectronics.utility.Logger;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BaseStation extends Block{
    public BaseStation() {
        super(Material.iron);
        setCreativeTab(CreativeTab.FE_TAB);
        //setBlockBounds(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F);
    }
    @SideOnly(Side.CLIENT)
    private IIcon top, front, bottom, back, left, right;
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        bottom = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_0");
        top = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_1");
        front = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_2");
        back = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_3");
        left = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_4");
        right = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_5");
    }
    public IIcon getIcon(int side, int meta){
        if (side == 0){
            return bottom;
        } else if (side == 1){
            return top;
        } else if (side == 2){
            return front;
        } else if (side == 3){
            return back;
        } else if (side == 4){
            return left;
        } else {
            return right;
        }
    }/*
    @SideOnly(Side.CLIENT)
    public IIcon[] sides;
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        sides[0] = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_0");
        sides[1] = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_1");
        sides[2] = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_2");
        sides[3] = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_3");
        sides[4] = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_4");
        sides[5] = iconRegister.registerIcon(Reference.MOD_ID+":"+ this.getUnlocalizedName().substring(5)+"_5");
    }
    public IIcon getIcon(int side, int meta){
        return sides[side < 3 ? side : 0 ];
    }*/
}