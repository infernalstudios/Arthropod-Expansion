package com.nekomaster1000.arthroexp.util;

import com.nekomaster1000.arthroexp.ArthroExp;
import com.nekomaster1000.arthroexp.entities.LadybugEntity;
import com.nekomaster1000.arthroexp.init.ArthroExpEntityTypes;
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