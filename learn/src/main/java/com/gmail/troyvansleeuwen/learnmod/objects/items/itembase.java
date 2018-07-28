package com.gmail.troyvansleeuwen.learnmod.objects.items;

import com.gmail.troyvansleeuwen.learnmod.main;
import com.gmail.troyvansleeuwen.learnmod.init.iteminit;
import com.gmail.troyvansleeuwen.learnmod.proxy.cleintproxy;
import com.gmail.troyvansleeuwen.learnmod.util.iHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class itembase extends Item implements iHasModel{
	
	public itembase(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		iteminit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		main.proxy.registermodel(this, 0, "inventory");
	}
	
}
