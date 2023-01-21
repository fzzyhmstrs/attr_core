package me.fzzyhmstrs.attributes_core;

import me.fzzyhmstrs.attributes_core.Attributes.MoreAttributes;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AC implements ModInitializer {

	public static final String MOD_ID = "attributes_core";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		MoreAttributes.registerAll();
	}
}