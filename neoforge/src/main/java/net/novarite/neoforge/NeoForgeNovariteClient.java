package net.novarite.neoforge;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.api.distmarker.Dist;

import net.neoforged.neoforge.common.NeoForge;
import net.novarite.neoforge.client.NeoForgeBlockColors;
import net.novarite.neoforge.client.NeoForgeModelLoading;

@Mod(
        value = "novarite",
        dist = Dist.CLIENT
)
public final class NeoForgeNovariteClient {

    public NeoForgeNovariteClient(IEventBus modEventBus) {
        modEventBus.addListener((net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterRenderers event) ->
                event.registerEntityRenderer(net.novarite.common.registry.ModEntities.CHAIR_SEAT.get(),
                        net.minecraft.client.renderer.entity.NoopRenderer::new));
        net.novarite.neoforge.scps.readers.NeoForgeReadersClient.register(modEventBus);
        net.novarite.neoforge.scps.doors.NeoForgeScpDoors.register(modEventBus);
        net.novarite.neoforge.furnitures.NeoForgeFurnituresPlates.register(modEventBus);
        net.novarite.neoforge.furnitures.NeoForgeFurnituresLockers.register(modEventBus);
        net.novarite.neoforge.furnitures.NeoForgeFurnituresDrawers.register(modEventBus);
        modEventBus.addListener(NeoForgeBlockColors::register);
        modEventBus.addListener(NeoForgeModelLoading::registerGeometryLoaders);
        modEventBus.addListener(net.novarite.neoforge.furnitures.NeoForgeFurnituresModelLoader::register);
        modEventBus.addListener(net.novarite.neoforge.furnitures.NeoForgeFurnituresParticles::register);

        net.novarite.common.copycatblocks.client.CopycatRendering.register();
    }
}
