package net.novarite.common.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;


import net.saphyra.common.platform.PlatformRegistry;
import net.saphyra.common.platform.PlatformRegistryObject;

public final class ModBlocks {

	private ModBlocks() {}

	// public static PlatformRegistryObject<Block> EXEMPLE;

	public static void register(PlatformRegistry registry) {
                
                // EXEMPLE = registry.registerBlock("exemple", Exemple::new);

	}

    /** Call after block registration, on the main setup thread. */
    public static void registerFlammables() {
        // Vanilla oak planks: encouragement 5, flammability 20.
        // ((FireBlock) Blocks.FIRE).setFlammable(EXEMPLE.get(), 5, 20);
    }
}
