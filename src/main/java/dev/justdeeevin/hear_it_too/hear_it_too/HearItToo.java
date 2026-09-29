package dev.justdeeevin.hear_it_too.hear_it_too;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*? if fabric {*/
import net.fabricmc.api.ModInitializer;
/*?}*/

/*? if forge {*/
/*import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
*//*?}*/

/*? if neoforge {*/
/*import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
*//*?}*/

/*? if neoforge {*/
/*@Mod(HearItToo.MOD_ID)
*//*?}*/
/*? if forge {*/
/*@Mod(HearItToo.MOD_ID)
*//*?}*/
public class HearItToo /*? if fabric {*/ implements ModInitializer /*?}*/ {
    public static final String MOD_ID = "hear_it_too";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    /*? if forge {*/
    /*public HearItToo(FMLJavaModLoadingContext context) {
        LOGGER.info("Hello Forge world!");
    }
    *//*?}*/

    /*? if neoforge {*/
    /*public HearItToo(IEventBus modEventBus) {
        LOGGER.info("Hello NeoForge world!");
    }
    *//*?}*/

    /*? if fabric {*/
    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
    /*?}*/
}
