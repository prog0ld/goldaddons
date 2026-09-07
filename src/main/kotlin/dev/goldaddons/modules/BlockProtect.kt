package dev.goldaddons.modules

import foo.starred.athen.config.Category
import foo.starred.athen.modules.Module
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents

class BlockProtect : Module("BlockProtect", "Prevents breaking protected blocks", Category.GENERAL) {

    init {
        // Register the pre-break listener directly with Fabric API
        PlayerBlockBreakEvents.BEFORE.register { world, player, pos, state, blockEntity ->
            // If the module is toggled off in Athen, let the block break normally
            if (!this.enabled) return@register true

            // Logic to protect blocks will go here
            true
        }
    }
}
