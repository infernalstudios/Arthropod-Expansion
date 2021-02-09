package dev.cernavskis.arthroexp.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import dev.cernavskis.arthroexp.entities.LadybugEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class LadybugModel extends EntityModel<LadybugEntity> {
    private final ModelRenderer all;
    private final ModelRenderer body;
    private final ModelRenderer head2;
    private final ModelRenderer rightshell;
    private final ModelRenderer leftshell;
    private final ModelRenderer rightwing;
    private final ModelRenderer leftwing;
    private final ModelRenderer legs;
    private final ModelRenderer leg1;
    private final ModelRenderer leg2;
    private final ModelRenderer leg3;
    private final ModelRenderer leg4;
    private final ModelRenderer leg5;
    private final ModelRenderer leg6;

    public LadybugModel() {
        textureWidth = 64;
        textureHeight = 64;

        all = new ModelRenderer(this);
        all.setRotationPoint(0.0F, 23.0F, 4.0F);
        

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 1.0F, -5.0F);
        all.addChild(body);
        body.setTextureOffset(16, 53).addBox(-5.0F, -6.2F, -3.0F, 10.0F, 3.0F, 3.0F, 0.3F, false);
        body.setTextureOffset(0, 10).addBox(-5.0F, -5.2F, -3.0F, 10.0F, 4.0F, 12.0F, 0.0F, false);

        head2 = new ModelRenderer(this);
        head2.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.addChild(head2);
        head2.setTextureOffset(0, 0).addBox(-3.0F, -5.2F, -5.0F, 6.0F, 4.0F, 5.0F, -0.001F, false);
        head2.setTextureOffset(0, 10).addBox(3.0F, -5.2F, -10.0F, 0.0F, 5.0F, 5.0F, -0.001F, false);
        head2.setTextureOffset(0, 10).addBox(-3.0F, -5.2F, -10.0F, 0.0F, 5.0F, 5.0F, -0.001F, false);

        rightshell = new ModelRenderer(this);
        rightshell.setRotationPoint(-3.0F, -6.0F, -1.0F);
        body.addChild(rightshell);
        rightshell.setTextureOffset(1, 28).addBox(-2.0F, -0.2F, 1.0F, 5.0F, 3.0F, 9.0F, 0.001F, false);

        leftshell = new ModelRenderer(this);
        leftshell.setRotationPoint(3.0F, -6.0F, -1.0F);
        body.addChild(leftshell);
        leftshell.setTextureOffset(31, 28).addBox(-3.0F, -0.2F, 1.0F, 5.0F, 3.0F, 9.0F, 0.001F, false);

        rightwing = new ModelRenderer(this);
        rightwing.setRotationPoint(0.0F, -5.0F, 0.0F);
        body.addChild(rightwing);
        rightwing.setTextureOffset(15, 43).addBox(-5.0F, -0.2F, 0.0F, 5.0F, 0.0F, 9.0F, 0.001F, true);

        leftwing = new ModelRenderer(this);
        leftwing.setRotationPoint(0.0F, -5.0F, 0.0F);
        body.addChild(leftwing);
        leftwing.setTextureOffset(15, 43).addBox(0.0F, -0.2F, 0.0F, 5.0F, 0.0F, 9.0F, 0.001F, false);

        legs = new ModelRenderer(this);
        legs.setRotationPoint(0.0F, 0.0F, -6.0F);
        all.addChild(legs);
        

        leg1 = new ModelRenderer(this);
        leg1.setRotationPoint(5.0F, -0.1F, 0.0F);
        legs.addChild(leg1);
        setRotationAngle(leg1, 0.0F, 0.0F, -1.1781F);
        leg1.setTextureOffset(0, 10).addBox(0.1F, -0.1F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

        leg2 = new ModelRenderer(this);
        leg2.setRotationPoint(5.0F, -0.1F, 4.0F);
        legs.addChild(leg2);
        setRotationAngle(leg2, 0.0F, 0.0F, -1.1781F);
        leg2.setTextureOffset(0, 10).addBox(0.1F, -0.1F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

        leg3 = new ModelRenderer(this);
        leg3.setRotationPoint(5.0F, -0.1F, 8.0F);
        legs.addChild(leg3);
        setRotationAngle(leg3, 0.0F, 0.0F, -1.1781F);
        leg3.setTextureOffset(0, 10).addBox(0.1F, -0.1F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

        leg4 = new ModelRenderer(this);
        leg4.setRotationPoint(-5.0F, -0.1F, 0.0F);
        legs.addChild(leg4);
        setRotationAngle(leg4, 0.0F, 0.0F, 1.1781F);
        leg4.setTextureOffset(0, 10).addBox(-0.1F, -0.1F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

        leg5 = new ModelRenderer(this);
        leg5.setRotationPoint(-5.0F, -0.1F, 4.0F);
        legs.addChild(leg5);
        setRotationAngle(leg5, 0.0F, 0.0F, 1.1781F);
        leg5.setTextureOffset(0, 10).addBox(-0.1F, -0.1F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);

        leg6 = new ModelRenderer(this);
        leg6.setRotationPoint(-5.0F, -0.1F, 8.0F);
        legs.addChild(leg6);
        setRotationAngle(leg6, 0.0F, 0.0F, 1.1781F);
        leg6.setTextureOffset(0, 10).addBox(-0.1F, -0.1F, -1.0F, 0.0F, 3.0F, 2.0F, 0.0F, false);
    }

    public void setRotationAngles(LadybugEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //previously the render function, render code was moved to a method below
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        all.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}