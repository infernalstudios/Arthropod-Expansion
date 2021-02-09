package dev.cernavskis.arthroexp.util;

import dev.cernavskis.arthroexp.ArthroExp;
import dev.cernavskis.arthroexp.client.entity.render.LadybugRenderer;
import dev.cernavskis.arthroexp.init.ArthroExpEntityTypes;
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
