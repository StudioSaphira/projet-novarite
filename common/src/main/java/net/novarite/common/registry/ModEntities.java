package net.novarite.common.registry;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import net.saphyra.common.platform.PlatformRegistry;
import net.saphyra.common.platform.PlatformRegistryObject;

public final class ModEntities {

    private ModEntities() {}

    // public static PlatformRegistryObject<EntityType<ChairSeatEntity>> EXEMPLE;

    public static void register(PlatformRegistry registry) {

        // EXEMPLE = registry.registerEntityType("exemple", () -> EntityType.Builder.of(ChairSeatEntity::new, MobCategory.MISC).sized(0.01F, 0.01F).clientTrackingRange(8).updateInterval(20).noSave().noSummon().build("novarite:exemple"));
    }
}
