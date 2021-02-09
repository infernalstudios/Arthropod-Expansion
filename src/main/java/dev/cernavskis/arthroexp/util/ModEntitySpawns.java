package dev.cernavskis.arthroexp.util;

import dev.cernavskis.arthroexp.ArthroExp;
import dev.cernavskis.arthroexp.entities.LadybugEntity;
import dev.cernavskis.arthroexp.init.ArthroExpEntityTypes;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;

@Mod.EventBusSubscriber(modid = ArthroExp.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {

    @SubscribeEvent
    public static void spawnEntities(FMLLoadCompleteEvent event) {
        GlobalEntityTypeAttributes.put(ArthroExpEntityTypes.LADYBUG.get(), LadybugEntity.setCustomAttributes().create());
    }
}