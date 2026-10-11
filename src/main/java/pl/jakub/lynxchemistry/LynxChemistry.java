package pl.jakub.lynxchemistry;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.jakub.lynxchemistry.item.ModItems;

public class LynxChemistry implements ModInitializer {
	public static final String MOD_ID = "lynx-chemistry";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.SULFUR.toString();
		ModItems.CARBON.toString();
		ModItems.IRON.toString();
		ModItems.SILICON.toString();
		ModItems.COPPER.toString();
		ModItems.OXYGEN_TUBE.toString();

		LOGGER.info("LynxChemistry initialized");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
