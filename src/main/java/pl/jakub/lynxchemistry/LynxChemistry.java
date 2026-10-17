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
		ModItems.ARGON_TUBE.toString();
		ModItems.CARBON_DIOXIDE_TUBE.toString();
		ModItems.HAZE_TUBE.toString();
		ModItems.NITROGEN_TUBE.toString();
		ModItems.OZONE_TUBE.toString();
		ModItems.WATER_VAPOR_TUBE.toString();
		ModItems.ALUMINIUM.toString();
		ModItems.COKE.toString();
		ModItems.GOLD.toString();
		ModItems.LEAD.toString();
		ModItems.LITHIUM.toString();
		ModItems.MAGNESIUM.toString();
		ModItems.NICKEL.toString();
		ModItems.PHOSPHORUS.toString();
		ModItems.SILVER.toString();
		ModItems.TIN.toString();
		ModItems.TITANIUM.toString();
		ModItems.URANIUM.toString();
		ModItems.ZINC.toString();


		LOGGER.info("LynxChemistry initialized");
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
