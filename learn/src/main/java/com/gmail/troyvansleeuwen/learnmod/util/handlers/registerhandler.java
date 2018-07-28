package com.gmail.troyvansleeuwen.learnmod.util.handlers;

import java.rmi.registry.Registry;

import com.gmail.troyvansleeuwen.learnmod.init.iteminit;
import com.gmail.troyvansleeuwen.learnmod.util.iHasModel;

import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
@EventBusSubscriber
public class registerhandler {
	@SubscribeEvent
	public static void onitemregister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(iteminit.ITEMS.toArray(new Item[0]));
	}
	@SubscribeEvent
	public static void onmodelregister(ModelRegistryEvent event) {
		for(Item item : iteminit.ITEMS) {
			if(item instanceof iHasModel) {
				((iHasModel)item).registerModels();
			}
		}
	}
}
