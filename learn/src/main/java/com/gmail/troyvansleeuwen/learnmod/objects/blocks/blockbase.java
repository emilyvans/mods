package com.gmail.troyvansleeuwen.learnmod.objects.blocks;

import com.gmail.troyvansleeuwen.learnmod.main;
import com.gmail.troyvansleeuwen.learnmod.init.blockinit;
import com.gmail.troyvansleeuwen.learnmod.init.iteminit;
import com.gmail.troyvansleeuwen.learnmod.util.iHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class blockbase extends Block implements iHasModel {

	public blockbase(Material material, String name) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		blockinit.Blocks.add(this);
		iteminit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		main.proxy.registermodel(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
