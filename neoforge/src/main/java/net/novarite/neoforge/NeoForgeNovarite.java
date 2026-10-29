package net.novarite.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.novarite.common.registry.ModBlocks;

import net.saphyra.neoforge.platform.NeoForgePlatformRegistry;

@Mod("novarite")
public final class NeoForgeNovarite {

    public NeoForgeNovarite(IEventBus modEventBus) {
        NeoForgePlatformRegistry registry = new NeoForgePlatformRegistry("novarite", modEventBus);

        net.novarite.common.registry.ModRegistries.register(registry);
        registry.register();
        net.novarite.neoforge.scps.readers.NeoForgeReaders.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(ModBlocks::registerFlammables);
    }
}
