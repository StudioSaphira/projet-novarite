package net.novarite.common.registry;

import net.minecraft.world.item.Item;

import net.saphyra.common.platform.PlatformRegistry;
import net.saphyra.common.platform.PlatformRegistryObject;

public final class ModItems {

	private ModItems() {}

	public static PlatformRegistryObject<Item> EXEMPLE;

	public static void register(PlatformRegistry registry) {

        // EXEMPLE = registry.registerBlockItem("exemple", ModBlocks.EXEMPLE);
        
	}
}
