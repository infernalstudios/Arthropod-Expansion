package com.nekomaster1000.arthroexp;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.nekomaster1000.arthroexp.init.ArthroExpEntityTypes;

@Mod(ArthroExp.MOD_ID)
public class ArthroExp {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "arthroexp";

    public ArthroExp() {
        MinecraftForge.EVENT_BUS.register(this);
        final IEventBus eventbus = FMLJavaModLoadingContext.get().getModEventBus();
        ArthroExpEntityTypes.register(eventbus);
    }

    @SubscribeEvent
    public void setup(FMLCommonSetupEvent event) { }
}
