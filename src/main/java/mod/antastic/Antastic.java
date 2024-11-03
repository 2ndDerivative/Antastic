package mod.antastic;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mod.antastic.blocks.ModBlocks;
import mod.antastic.items.ModItems;

public class Antastic implements ModInitializer {
	public static final String MOD_ID = "antastic";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier identifier(String id) {
		return Identifier.of(MOD_ID, id);
	}
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModBlocks.initialize();
		ModItems.initialize();

		LOGGER.info("Ants! Ants! Ants! Ants...");
	}
}