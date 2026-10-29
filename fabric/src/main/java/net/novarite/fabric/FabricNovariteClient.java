package net.novarite.fabric;

import net.fabricmc.api.ClientModInitializer;

import net.novarite.fabric.client.FabricBlockColors;
import net.novarite.fabric.client.FabricModelLoading;
import net.novarite.fabric.furnitures.*;

@SuppressWarnings("unused")
public final class FabricNovariteClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry.register(
        net.novarite.common.registry.ModEntities.CHAIR_SEAT.get(),
        net.minecraft.client.renderer.entity.NoopRenderer::new);
        net.novarite.fabric.scps.readers.FabricReadersClient.register();
        net.novarite.fabric.scps.doors.FabricScpDoors.register();
        FabricBlockColors.register();
        FabricModelLoading.register();
        FabricFurnituresModelLoader.register();
        net.novarite.common.copycatblocks.client.CopycatRendering.register();
    }
}
