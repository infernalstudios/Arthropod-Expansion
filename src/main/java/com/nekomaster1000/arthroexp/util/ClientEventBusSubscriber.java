package com.nekomaster1000.arthroexp.util;

import com.nekomaster1000.arthroexp.ArthroExp;
import com.nekomaster1000.arthroexp.client.entity.render.LadybugRenderer;
import com.nekomaster1000.arthroexp.init.ArthroExpEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ArthroExp.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ArthroExpEntityTypes.LADYBUG.get(), LadybugRenderer::new);
    }
}
