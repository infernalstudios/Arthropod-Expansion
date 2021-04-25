package com.nekomaster1000.arthroexp.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.FlyingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class LadybugEntity extends FlyingEntity {

    public LadybugEntity(EntityType<? extends FlyingEntity> type, World worldIn) {
        super(type, worldIn);
    }
    
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 10.0D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 1.0D)
                .createMutableAttribute(Attributes.ATTACK_KNOCKBACK, 1.5D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.6D);
    }

}
