package com.gmail.troyvansleeuwen.learnmod;

import com.gmail.troyvansleeuwen.learnmod.proxy.commonproxy;
import com.gmail.troyvansleeuwen.learnmod.util.ref;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

@Mod(modid = ref.modid, name = ref.name, version = ref.version)
public class main {
	@Instance
	public static main instance;
	
	@SidedProxy(clientSide = ref.cleint, serverSide = ref.server)
	public static commonproxy proxy;
	
	@EventHandler
	public static void preinit(FMLPreInitializationEvent event) {
		
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		
	}
	@EventHandler
	public static void postinit(FMLPostInitializationEvent event) {
		
	}
}
