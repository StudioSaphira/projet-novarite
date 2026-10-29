package net.novarite.common.constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Global constants used throughout Novarite.
 */
public final class ModConstants {

    /**
     * Mod identifier.
     */
    public static final String MOD_ID = "novarite";

    /**
     * Mod logger.
     */
    public static final Logger LOGGER = LogManager.getLogger();

    /**
     * Prevent instantiation.
     */
    private ModConstants() {
    }

}
