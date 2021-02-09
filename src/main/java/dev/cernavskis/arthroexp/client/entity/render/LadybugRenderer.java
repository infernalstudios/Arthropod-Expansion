package dev.cernavskis.arthroexp.client.entity.render;

import dev.cernavskis.arthroexp.ArthroExp;
import dev.cernavskis.arthroexp.client.entity.model.LadybugModel;
import dev.cernavskis.arthroexp.entities.LadybugEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class LadybugRenderer extends MobRenderer<LadybugEntity, LadybugModel> {
    
    protected static final ResourceLocation TEXTURE = new ResourceLocation(ArthroExp.MOD_ID, "textures/entity/ladybug.png");
    
    public LadybugRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new LadybugModel(), 0.7f);
    }
    
    @Override
    public ResourceLocation getEntityTexture(LadybugEntity entity) {
        return TEXTURE;
    }
}