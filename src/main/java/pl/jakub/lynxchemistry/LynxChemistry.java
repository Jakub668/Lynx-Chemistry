package pl.jakub.lynxchemistry;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.jakub.lynxchemistry.item.ModItems;
import pl.jakub.lynxchemistry.block.ModBlocks;

public class LynxChemistry implements ModInitializer {
	public static final String MOD_ID = "lynx-chemistry";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.AIR_SEPARATOR.toString();
		ModItems.SULFUR.toString();
		ModItems.CARBON.toString();
		ModItems.IRON.toString();
		ModItems.SILICON.toString();
		ModItems.COPPER.toString();
		ModItems.OXYGEN_TUBE.toString();
		ModItems.TUBE.toString();


		LOGGER.info("LynxChemistry initialized");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
