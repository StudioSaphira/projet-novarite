package net.novarite.fabric;

import net.fabricmc.api.ModInitializer;

import net.saphyra.fabric.platform.FabricPlatformRegistry;
import net.novarite.common.registry.ModBlocks;

@SuppressWarnings("unused")
public final class FabricNovarite implements ModInitializer {

    @Override
    public void onInitialize() {
        FabricPlatformRegistry registry = new FabricPlatformRegistry("novarite");

        net.novarite.common.registry.ModRegistries.register(registry);
        registry.register();
        net.novarite.fabric.scps.readers.FabricReaders.register();
        ModBlocks.registerFlammables();
    }
}
