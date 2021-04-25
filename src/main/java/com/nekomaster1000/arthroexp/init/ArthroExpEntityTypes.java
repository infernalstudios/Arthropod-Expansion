package com.nekomaster1000.arthroexp.init;

import com.nekomaster1000.arthroexp.ArthroExp;
import com.nekomaster1000.arthroexp.entity.LadybugEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArthroExpEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ArthroExp.MOD_ID);
    
    public static final RegistryObject<EntityType<LadybugEntity>> LADYBUG = ENTITY_TYPES.register("ladybug",
            () -> EntityType.Builder.create(LadybugEntity::new, EntityClassification.CREATURE)
                    .size(1.0f, 1.0f)
                    .build(new ResourceLocation(ArthroExp.MOD_ID, "ladybug").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
        ArthroExp.LOGGER.info("Infernal Expansion: Entity Types Registered!");
    }
    
}
