package com.miserableasf.crystallium;

import com.miserableasf.crystallium.ModItems.CrystalliumItemGroups;
import com.miserableasf.crystallium.ModItems.CrystalliumItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Crystallium implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Crystallium");
	public static final String MOD_ID = "crystallium";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Crystallium");
		CrystalliumItems.load();
		CrystalliumItemGroups.load();
		CrystalliumItemGroups.load();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}