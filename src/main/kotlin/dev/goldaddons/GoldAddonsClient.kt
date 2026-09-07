package dev.goldaddons

import net.fabricmc.api.ClientModInitializer
import org.slf4j.LoggerFactory

object GoldAddonsClient : ClientModInitializer {
    private val LOGGER = LoggerFactory.getLogger("${GoldAddons.MOD_ID}-client")

    override fun onInitializeClient() {
        LOGGER.info("GoldAddonsClient initializing")
        // this is where we'll hook into Athen and register modules
    }
}