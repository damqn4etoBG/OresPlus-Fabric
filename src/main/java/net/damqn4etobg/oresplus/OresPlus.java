package net.damqn4etobg.oresplus;

import net.damqn4etobg.oresplus.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OresPlus implements ModInitializer {

	public static final String MOD_ID = "oresplus";

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();

		System.out.println("Hello Fabric world!");
	}
}