package com.gmail.troyvansleeuwen.learnmod.init;

import java.util.ArrayList;
import java.util.List;

import com.gmail.troyvansleeuwen.learnmod.objects.blocks.blockbase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockinit {
	public static final List<Block> Blocks = new ArrayList<Block>();
	
	public static final Block block_test = new blockbase(Material.IRON, "block_test");
	
}
